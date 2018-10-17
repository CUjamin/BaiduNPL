package cuj.baidu.nlp.service.nlp;

import com.alibaba.fastjson.JSON;
import com.baidu.aip.nlp.AipNlp;
import cuj.baidu.nlp.contact.NLPParam;
import cuj.baidu.nlp.domain.nlp.SentimentClassifyResponse;
import cuj.baidu.nlp.domain.nlp.LexicalResponse;
import org.json.JSONObject;

import java.util.HashMap;

/**
 * @Auther: cujamin
 * @Date: 2018/10/17 13:35
 * @Description:
 */
public class NLPServiceImpl implements NLPService {

    @Override
    public LexicalResponse lexicalAnalysis(String text) {
        AipNlp client = new AipNlp(NLPParam.NLP_APP_ID, NLPParam.NLP_API_KEY,NLPParam.NLP_SECRET_KEY);
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);

        // 可选：设置代理服务器地址, http和socket二选一，或者均不设置
//        client.setHttpProxy("proxy_host", proxy_port);  // 设置http代理
//        client.setSocketProxy("proxy_host", proxy_port);  // 设置socket代理

        // 可选：设置log4j日志输出格式，若不设置，则使用默认配置
        // 也可以直接通过jvm启动参数设置此环境变量
//        System.setProperty("aip.log4j.conf", "path/to/your/log4j.properties");

        // 调用接口
        HashMap<String, Object> options =new HashMap<>();
        JSONObject res = client.lexer(text,null);
        return JSON.parseObject(res.toString(2), LexicalResponse.class);
    }

    @Override
    public SentimentClassifyResponse sentimentClassify(String text) {
        AipNlp client = new AipNlp(NLPParam.NLP_APP_ID, NLPParam.NLP_API_KEY,NLPParam.NLP_SECRET_KEY);
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);
        // 传入可选参数调用接口

        // 传入可选参数调用接口
        HashMap<String, Object> options = new HashMap<String, Object>();

        // 情感倾向分析
        JSONObject res = client.sentimentClassify(text, options);

        return JSON.parseObject(res.toString(2),SentimentClassifyResponse.class);
    }
}
