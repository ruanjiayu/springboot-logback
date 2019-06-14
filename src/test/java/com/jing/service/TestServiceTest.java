package com.jing.service;

import com.jing.SpringbootLogbackApplicationTests;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @author ruanjiayu
 * @dateTime 2019/6/14 15:37
 */
public class TestServiceTest extends SpringbootLogbackApplicationTests{

    @Resource
    private  TestService testService;

    @Test
    public void testLog() throws Exception {
        testService.testLog();
    }

}