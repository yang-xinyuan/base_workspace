package com.base.springbase.common.baseController;

import com.base.autoconfig.common.config.domain.DemoDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("base")
@Controller
public class BaseController {
    @Autowired
    private DemoDomain domain;
    @RequestMapping("print")
    public String print(){
        System.out.println(domain.getName());
        System.out.println(domain.getSex());
        return "success";
    }
}
