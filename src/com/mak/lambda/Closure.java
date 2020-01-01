package com.mak.lambda;



import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * 闭包：会提升局部变量的生命周期
 */
public class Closure {

    private static Supplier<Integer> getNum(){

        int num = 10;

        return () -> num;
    }



    public static void main(String[] args) {
        Integer value = Closure.getNum().get();
        System.out.println(value);
        //num的生命周期只是在getNum方法中，但是我用lambda表达式将它返回后，显然能获得到它的值，它的生命周期被延长了

        int m = 7;
        Consumer<Integer> consumer = ele -> System.out.println(m);
        consumer.accept(1);
        //直接输出m，这里的m是常量 final


    }



}
