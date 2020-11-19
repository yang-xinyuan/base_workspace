package com.base.springbase.common.baseController;

import com.base.springbase.common.autoconfig.domain.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("base")
@Controller
public class BaseController {
    @Autowired
    private School school;
    @RequestMapping("print")
    public String print(){
        school.ding();
        return "success";
    }
}
