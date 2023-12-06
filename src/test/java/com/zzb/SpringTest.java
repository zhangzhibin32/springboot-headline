package com.zzb;

import com.zzb.utils.JwtHelper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author: zhang
 * @date: 2023/12/5 17:42
 * @description:
 */
@SpringBootTest
public class SpringTest  {
    @Autowired
    private JwtHelper jwtHelper;
    @Test
    public void test01(){
        String token=jwtHelper.createToken(1L);
        System.out.println("token = " + token);
        int userId = jwtHelper.getUserId(token).intValue();
        System.out.println("userId = " + userId);
        boolean expiration = jwtHelper.isExpiration(token);
        System.out.println("expiration = " + expiration);


    }
}
