package com.base.springlambda.lambda;

import com.base.springlambda.lambda.domain.A;
import com.base.springlambda.lambda.domain.B;
import com.base.springlambda.lambda.domain.C;
import com.base.springbase.lambda.service.DemoService;

import java.io.File;
import java.io.FileFilter;
import java.util.*;
import java.util.function.Consumer;

public class lambda<T>{
    public static void main(String[] args) {

        inter interS = new interS();
        interS.b();
    }



    interface  inter{

        default void  b(){
            System.out.println("inter");
        };
    }
    static class interS implements  inter{
        @Override
        public void b() {
            System.out.println("interS");
        }
    }

}

