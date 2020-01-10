package com.xpf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: Xia
 * @Date: 2019/12/16 11:23
 * @Email：x2358114512@163.com
 */
@Controller
@RequestMapping(value = "controller/")
public class QuickSpringBoot {

    @RequestMapping(value = "quickSpringBoot")
    @ResponseBody
    public String quickSpringBoot(){
        return "哈哈哈 SpringBoot";
    }//controller/quickSpringBoot
}
