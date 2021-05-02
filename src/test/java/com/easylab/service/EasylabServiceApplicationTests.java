package com.easylab.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EasylabServiceApplicationTests {
    @Test
    void contextLoads() {

        String name;
        name = EasylabServiceApplication.class.getName();
        Assertions.assertEquals("com.easylab.service.EasylabServiceApplication", name);
    }

}
