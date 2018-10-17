package cuj.baidu.nlp.service.nlp;

import cuj.baidu.nlp.domain.nlp.DepParserResponse;
import cuj.baidu.nlp.domain.nlp.EcnetResponse;
import cuj.baidu.nlp.domain.nlp.SentimentClassifyResponse;
import cuj.baidu.nlp.domain.nlp.LexicalResponse;
import org.junit.Test;

/**
 * @Auther: cujamin
 * @Date: 2018/10/17 13:40
 * @Description:
 */
public class NLPServiceImplTest {
    NLPService nlpService = new NLPServiceImpl();

    @Test
    public void lexicalAnalysis() {
        LexicalResponse lexicalResponse = nlpService.lexicalAnalysis("百度是一家高科技公司");
        System.out.println(lexicalResponse.toString());
    }

    @Test
    public void sentimentClassify() {
        SentimentClassifyResponse sentimentClassifyResponse = nlpService.sentimentClassify("今天不高兴");
        System.out.println(sentimentClassifyResponse.toString());
    }

    @Test
    public void depParser() {
        DepParserResponse depParserResponse = nlpService.depParser("今天天气怎么样");
        System.out.println(depParserResponse.toString());
    }

    @Test
    public void ecnet() {
        //目前无权限
        EcnetResponse ecnetResponse = nlpService.ecnet("全是搓憋自");
        System.out.println(ecnetResponse.toString());
    }
}