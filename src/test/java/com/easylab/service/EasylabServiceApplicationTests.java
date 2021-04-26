package com.easylab.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class EasylabServiceApplicationTests {
    @Test
    void contextLoads() {

        String name = EasylabServiceApplication.class.getName();
        Assertions.assertEquals("com.easylab.service.EasylabServiceApplication", name);
    }

}
