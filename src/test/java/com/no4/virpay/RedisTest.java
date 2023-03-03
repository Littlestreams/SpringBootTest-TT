package com.no4.virpay;

import com.no4.virpay.utils.RedisUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author lvqi
 * @Title:
 * @Package
 * @Description:
 * @date 2023/3/2 17:29
 */
@SpringBootTest
public class RedisTest {
    @Autowired
    private RedisUtils redisUtils;
    @Test
    public void pingTest(){
        System.out.println(redisUtils.ping());
    }
}
