package com.base.springlambda.actualcombat.test2_1.Service.impl;

import com.base.springlambda.actualcombat.test2_1.Service.ApplePredicate;
import com.base.springlambda.actualcombat.test2_1.domain.Apple;
import com.base.springlambda.actualcombat.test2_1.domain.AppleEnum;

public class GreenApplePredicateImpl implements ApplePredicate {

    @Override
    public boolean select(Apple apple) {
        if(AppleEnum.GREEN.equals(apple.getColor())){
            apple.print();
            return true;
        }else{
            return false;
        }

    }
}
