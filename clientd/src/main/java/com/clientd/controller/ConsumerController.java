package com.clientd.controller;

import com.clientd.service.ConsumerService;
import org.apache.juli.logging.LogFactory;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by lianghuanxun on 2018/5/20 0020
 */
@RestController
@RequestMapping("/config")
public class ConsumerController {
    @Autowired
    private ConsumerService consumerService;
    @RequestMapping("/test")
    public void consumer(){
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>.....success!");
        String result=consumerService.search();
        System.out.println(result);
    }
}
