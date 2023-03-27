package com.no4.virpay;

import com.no4.virpay.dao.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author lvqi
 * @Title:
 * @Package
 * @Description:
 * @date 2022/10/25 11:28
 */
@SpringBootTest()
public class Test {
    @Value("${server.port}")
    private String port;
    @org.junit.jupiter.api.Test
    public void testJson() {
        System.out.println("hhh");
        System.out.println(port);
    }
}
