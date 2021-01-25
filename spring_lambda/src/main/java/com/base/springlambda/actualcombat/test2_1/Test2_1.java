package com.base.springlambda.actualcombat.test2_1;

import com.base.springlambda.actualcombat.test2_1.Service.ApplePredicate;
import com.base.springlambda.actualcombat.test2_1.Service.impl.GreenApplePredicateImpl;
import com.base.springlambda.actualcombat.test2_1.Service.impl.RedApplePredicateImpl;
import com.base.springlambda.actualcombat.test2_1.Service.impl.WeightApplePredicateImpl;
import com.base.springlambda.actualcombat.test2_1.domain.Apple;
import com.base.springlambda.actualcombat.test2_1.domain.AppleEnum;

import java.util.ArrayList;
import java.util.List;

public class Test2_1 {

    public void prettyPrintApple_1(List<Apple> appleList){
        for (int i = 0; i < appleList.size(); i++) {
            Apple apple = appleList.get(i);
            if(apple.getColor().equals(AppleEnum.RED)){
                apple.print();
                if(apple.getWeight()>100){
                    System.out.println("重量是轻的");
                }else{
                    System.out.println("重量是重的");
                }
            }
            if(apple.getColor().equals(AppleEnum.GREEN)){
                apple.print();
                if(apple.getWeight()>100){
                    System.out.println("重量是轻的");
                }else{
                    System.out.println("重量是重的");
                }
            }

        }
    }

    public static void main(String[] args) {

        Comparable<Apple> appleComparable = new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
        ArrayList<Apple> appleList = new ArrayList<>();
        Apple apple = new Apple();
        apple.setColor(AppleEnum.GREEN);
        apple.setWeight(100.0F);
        appleList.add(apple);
        Apple apple2 = new Apple();
        apple2.setColor(AppleEnum.RED);
        apple2.setWeight(40.0F);
        appleList.add(apple2);
        prettyPrintApple_2(appleList, new GreenApplePredicateImpl());
        prettyPrintApple_2(appleList, new RedApplePredicateImpl());
        prettyPrintApple_2(appleList, new WeightApplePredicateImpl());
    }
    public static void prettyPrintApple_2(List<Apple> appleList, ApplePredicate predicate){
       // ArrayList<Apple> apples = new ArrayList<>();
        for (Apple apple:
             appleList) {
            if(predicate.select(apple)){

            }
        }
    }


}
