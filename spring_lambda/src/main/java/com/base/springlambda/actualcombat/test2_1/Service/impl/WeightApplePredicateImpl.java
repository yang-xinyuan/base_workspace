package com.base.springlambda.actualcombat.test2_1.Service.impl;

import com.base.springlambda.actualcombat.test2_1.Service.ApplePredicate;
import com.base.springlambda.actualcombat.test2_1.domain.Apple;

public class WeightApplePredicateImpl implements ApplePredicate {
    @Override
    public boolean select(Apple apple) {
        if(apple.getWeight()<50){
            System.out.println("重量为："+apple.getWeight()+";重量轻了");
            return true;
        }else{
            System.out.println("重量为："+apple.getWeight()+";重量重了");
            return false;
        }

    }
}
