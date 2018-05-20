package com.client.clientdome.service.impl;

import com.client.clientdome.service.SearchService;
import org.springframework.stereotype.Service;

/**
 * Create by lianghuanxun on 2018/5/20 0020
 */
@Service
public class SeacherServiceImpl implements SearchService {
    @Override
    public String find() {
        System.out.println("Hello Spring cloud this is compute-service");
        return "success";
    }
}
