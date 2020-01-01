package com.mak.lambda;

import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * java.util.function是jdk8新加的包
 * foreach() stream() removeIf()都是jdk8新加的方法
 * @FunctionalInterface 也是jdk8新加的注解
 *
 * 关于此类的方法引用 eg:String :: toUpperCase需要思考以下
 *
 *
 * 函数式接口作为方法参数是提供一种行为(动作，逻辑)
 *
 *
 * 函数式编程是指一种写的更少做得更多的编程方法，它将函数作为方法参数从而传递不同的行为
 * 这避免了定义多个方法去实现多个不同的行为，这颠覆了面向对象编程，很显然它更加高效；
 */

public class FunctionalInterfaceTest {

    public static int calculate(int val, Function<Integer,Integer> function){
        return function.apply(val);

    }


    public static void main(String[] args) {

        //Function<T,R> R apply(T t);

//        Function<String,String> function = String::toUpperCase;
        //why
//        Function<String,String> function1 = s -> s.toUpperCase();

        //传递行为
        System.out.println(calculate(2,val -> val * val));
        System.out.println(calculate(2,val -> val + 1));


        //Function串联
        // v t
        Function<Object,Integer> before = val -> (int)val*(int)val;
        // t r
        Function<Integer,Object> function = val -> val + 1;
        // v r
        Function<Object,Object> composeFunc = function.compose(before);
        System.out.println(composeFunc.apply(2));
        //实现了这个函数式接口中的方法，就是一个该接口的匿名内部类，强调一下；compose andThen就没问题了

        //Predicate







    }
}
