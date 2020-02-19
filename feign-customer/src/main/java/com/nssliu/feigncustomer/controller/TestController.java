package com.nssliu.feigncustomer.controller;

import com.nssliu.feigncustomer.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuzhiheng
 * @version 1.0
 * @date 2020/2/19 19:11
 * @describe:
 */
@RestController
@RequestMapping("/testController")
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping(value = "/testinterfacebyfeign")
    public String sayHi(@RequestParam String name) {
        return testService.getValue( name );
    }
}

