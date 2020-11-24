package com.base.springlambda.lambda;

import com.base.springbase.lambda.service.DemoService;

class Demo<T>{
    public void DemoTest(DemoService service){
        service.testMethod();
    }
}