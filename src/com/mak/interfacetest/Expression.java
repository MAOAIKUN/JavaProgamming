package com.mak.interfacetest;

public interface Expression {

    default void D(int i){
        System.out.println("亮"+i+"级狗牌");
    }

    default void F(){
        System.out.println("test");
    }

    static void staticFunc(){
        System.out.println("i am static method");
    }
}
