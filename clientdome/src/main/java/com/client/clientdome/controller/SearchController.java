package com.client.clientdome.controller;

import com.client.clientdome.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by lianghuanxun on 2018/5/20 0020
 */
@RestController
public class SearchController {
    @Autowired
    private SearchService searchService;
    @RequestMapping("/test")
    public  String  search(){
        return searchService.find();

    }
}
