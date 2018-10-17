package cuj.baidu.nlp.service.nlp;

import com.alibaba.fastjson.JSON;
import com.baidu.aip.nlp.AipNlp;
import cuj.baidu.nlp.contact.NLPParam;
import cuj.baidu.nlp.domain.nlp.DepParserResponse;
import cuj.baidu.nlp.domain.nlp.EcnetResponse;
import cuj.baidu.nlp.domain.nlp.SentimentClassifyResponse;
import cuj.baidu.nlp.domain.nlp.LexicalResponse;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

/**
 * @Auther: cujamin
 * @Date: 2018/10/17 13:35
 * @Description:
 */
public class NLPServiceImpl implements NLPService {
    public static final Logger log = LoggerFactory.getLogger(NLPServiceImpl.class);


    @Override
    public LexicalResponse lexicalAnalysis(String text) {
        AipNlp client = new AipNlp(NLPParam.NLP_APP_ID, NLPParam.NLP_API_KEY,NLPParam.NLP_SECRET_KEY);
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);
        HashMap<String, Object> options = new HashMap<String, Object>();
        JSONObject res = client.lexer(text,options);
        String result = res.toString(2);
        log.info("lexicalAnalysis - text:{};response:{};",text,result);
        return JSON.parseObject(result, LexicalResponse.class);
    }

    @Override
    public SentimentClassifyResponse sentimentClassify(String text) {
        AipNlp client = new AipNlp(NLPParam.NLP_APP_ID, NLPParam.NLP_API_KEY,NLPParam.NLP_SECRET_KEY);
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);
        HashMap<String, Object> options = new HashMap<String, Object>();
        JSONObject res = client.sentimentClassify(text, options);
        String result = res.toString(2);
        log.info("sentimentClassify - text:{};response:{};",text,result);
        return JSON.parseObject(result,SentimentClassifyResponse.class);
    }

    @Override
    public DepParserResponse depParser(String text) {
        AipNlp client = new AipNlp(NLPParam.NLP_APP_ID, NLPParam.NLP_API_KEY,NLPParam.NLP_SECRET_KEY);
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);
        HashMap<String, Object> options = new HashMap<String, Object>();
        options.put("mode", 1);
        JSONObject res = client.depParser(text, options);
        String result = res.toString(2);
        log.info("depParser - text:{};response:{};",text,result);
        return JSON.parseObject(result,DepParserResponse.class);
    }

    //目前无权限
    @Override
    public EcnetResponse ecnet(String text) {
        AipNlp client = new AipNlp(NLPParam.NLP_APP_ID, NLPParam.NLP_API_KEY,NLPParam.NLP_SECRET_KEY);
        HashMap<String, Object> options = new HashMap<String, Object>();
        JSONObject res = client.ecnet(text, options);
        String result = res.toString(2);
        log.info("ecnet - text:{};response:{};",text,result);
        return JSON.parseObject(result,EcnetResponse.class);
    }
}
