package cuj.baidu.nlp.util;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Auther: cujamin
 * @Date: 2018/10/17 19:21
 * @Description:
 */
public class HttpUtilTest {

    @Test
    public void post() {
        String url = "https://aip.baidubce.com/rpc/2.0/unit/bot/chat";
        String token="24.6f17d4bbbb5894526fbed365e64d6688.2592000.1542363715.282335-14463638";
        String params="{\"bot_session\":\"\",\"log_id\":\"7758521\",\"request\":{\"bernard_level\":1,\"client_session\":\"{\\\"client_results\\\":\\\"\\\", \\\"candidate_options\\\":[]}\",\"query\":\"什么\",\"query_info\":{\"asr_candidates\":[],\"source\":\"KEYBOARD\",\"type\":\"TEXT\"},\"updates\":\"\",\"user_id\":\"88888\"},\"bot_id\":\"13349\",\"version\":\"2.0\"}";
        String charset="GBK";
        try {
            System.out.println(HttpUtil.post(url,token,params,charset));

        }catch (Exception e){

        }
    }
}