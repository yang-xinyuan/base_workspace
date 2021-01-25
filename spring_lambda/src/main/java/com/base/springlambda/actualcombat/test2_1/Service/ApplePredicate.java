package com.base.springlambda.actualcombat.test2_1.Service;

import com.base.springlambda.actualcombat.test2_1.domain.Apple;

/**
 * 以苹果为维度区分
 */
public interface ApplePredicate {
    /**
     * 区分
     * @param apple
     * @return
     */
    boolean select(Apple apple);

}
