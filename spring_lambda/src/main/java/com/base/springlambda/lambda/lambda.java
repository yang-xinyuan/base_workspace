package com.base.springbase.lambda;

import com.base.springbase.lambda.domain.A;
import com.base.springbase.lambda.domain.B;
import com.base.springbase.lambda.domain.C;
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

