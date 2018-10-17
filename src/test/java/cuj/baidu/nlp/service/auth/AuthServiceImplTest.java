package cuj.baidu.nlp.service.auth;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Auther: cujamin
 * @Date: 2018/10/17 13:30
 * @Description:
 */
public class AuthServiceImplTest {
    AuthService authService = new AuthServiceImpl();
    public static final String apiKey="IC5HNcVkWMhKZzhqGtiwwofV";
    public static final String securetKey = "nYSzOUwwvfiOkK9u8xC0hVHocmUIECut";

    @Test
    public void getAuth() {
        System.out.println("token:"+authService.getAuth(apiKey,securetKey));
    }
}