package com.mak.lambda;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionTest {

    //对一个值进行运算

    public static Integer compute(int a, Function<Integer, Integer> function) {
        return function.apply(a);
    }

    //两个行为进行组合运算,先计算before;
    public static Integer compose(int a, Function<Integer, Integer> function, Function<Integer, Integer> before) {
        return function.compose(before).apply(a);
    }


    //两个行为进行组合运算，后计算after
    public static Integer andThen(int a,Function<Integer,Integer> function,Function<Integer,Integer> after){
        return function.andThen(after).apply(a);
    }

    public static void main(String[] args) {
        //断言开启只能一个一个开吗我靠
        //assert false;
        int m = 10;
        System.out.println(compute(m, a -> a * a));
        System.out.println(compose(m, a -> a * a, a -> a / 3));
        System.out.println(andThen(m, a -> a * a, a -> a / 3));


    }

}
