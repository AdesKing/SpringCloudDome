package com.clientd.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create by lianghuanxun on 2018/5/20 0020
 */
@FeignClient("compute-service")
@Service
public interface ConsumerService {
    @RequestMapping("/test")
    public String search();
}
