package com.jing.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author ruanjiayu
 * @dateTime 2019/6/14 15:35
 */
@Service
@Slf4j
public class TestService {

    public void testLog(){
        log.debug("我是debug");
        log.info("我是info");
        log.warn("我是warn");
        log.error("我是error");
    }
}
