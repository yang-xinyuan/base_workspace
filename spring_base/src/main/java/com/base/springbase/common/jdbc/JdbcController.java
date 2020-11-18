package com.base.springbase.common.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jdbc")
public class JdbcController {
    @Autowired
    JdbcDemo demo;
    @RequestMapping("print")
    public void print(){
        demo.jdbcRun();
        System.out.println("hello word");
    }
}
