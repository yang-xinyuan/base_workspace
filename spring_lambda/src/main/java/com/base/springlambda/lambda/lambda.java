package com.base.springlambda.lambda;

import com.base.springlambda.lambda.domain.A;
import com.base.springlambda.lambda.domain.B;
import com.base.springlambda.lambda.domain.C;
import com.base.springbase.lambda.service.DemoService;

import java.util.*;
import java.util.function.Consumer;

public class lambda<T>{
    public static void main(String[] args) {
        Demo<String> stringDemo = new Demo<>();
        stringDemo.DemoTest(new DemoService() {
            @Override
            public void testMethod() {
                System.out.println("aaa");
            }
        });

    }

}

