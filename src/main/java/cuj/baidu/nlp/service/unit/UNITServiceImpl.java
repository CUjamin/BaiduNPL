package cuj.baidu.nlp.service.unit;

import cuj.baidu.nlp.util.HttpUtil;

/**
 * @Auther: cujamin
 * @Date: 2018/10/17 17:36
 * @Description:
 */
public class UNITServiceImpl implements UNITService {
    public static final String URL = "https://aip.baidubce.com/rpc/2.0/unit/bot/chat";

    @Override
    public String utterance(String text,String token) {
        try {
            // 请求参数
            String params = "{\"bot_session\":\"\",\"log_id\":\"7758521\",\"request\":{\"bernard_level\":1,\"client_session\":\"{\\\"client_results\\\":\\\"\\\", \\\"candidate_options\\\":[]}\",\"query\":\"你好\",\"query_info\":{\"asr_candidates\":[],\"source\":\"KEYBOARD\",\"type\":\"TEXT\"},\"updates\":\"\",\"user_id\":\"88888\"},\"bot_id\":\"1057\",\"version\":\"2.0\"}";


            String result = HttpUtil.post(URL, "",params,"application/json");
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
