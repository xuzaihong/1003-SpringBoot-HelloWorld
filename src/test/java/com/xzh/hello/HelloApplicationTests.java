package com.xzh.hello;

import com.xzh.hello.bean.Dog;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloApplicationTests {

    @Autowired
    Dog dog;

    @Test
    void contextLoads() {
        System.out.println(dog);
    }

}
