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
    public static final String apiKey="3tG6dOIiQ7zGDg8eg2Kj8TYn";
    public static final String securetKey = "a6y208ed5ymQNvc1CiVAkjWRIKhP7SU3";

    @Test
    public void getAuth() {
        System.out.println("token:"+authService.getAuth(apiKey,securetKey));
    }
}