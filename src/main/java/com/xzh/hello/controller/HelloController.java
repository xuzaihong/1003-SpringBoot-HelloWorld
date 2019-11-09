package com.xzh.hello.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("/hello")
    public String hello() {
        logger.info("你好");
        logger.warn("hahah");

        return "HelloWorld...";
    }

}
