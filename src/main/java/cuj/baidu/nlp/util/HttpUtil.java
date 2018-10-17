package cuj.baidu.nlp.util;

import org.apache.http.*;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URI;
import java.util.Map;

/**
 * @Auther: cujamin
 * @Date: 2018/10/17 17:44
 * @Description:
 */
public class HttpUtil {
    private static final Logger logger = LoggerFactory.getLogger(HttpUtil.class);


    public static String post(String url , String token,String params, String charset) throws Exception{
        HttpClient httpClient = new DefaultHttpClient();
        HttpPost httpPost = new HttpPost();

        String uri = url+"?access_token="+token;
        httpPost.setURI(new URI(uri));

        StringEntity entity = new StringEntity(params );
        httpPost.setEntity(entity);
        HttpResponse response = httpClient.execute(httpPost);
        try {
            StatusLine status = response.getStatusLine();
            int state = status.getStatusCode();
            if (state == HttpStatus.SC_OK) {
                HttpEntity responseEntity = response.getEntity();
                String jsonString = EntityUtils.toString(responseEntity);
                return jsonString;
            }
            else{
                logger.error("请求返回:"+state+"("+url+")");
            }
        }
        finally {
        }
        return null;
    }
}
