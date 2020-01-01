package com.mak.lambda;

/**
 * lambda表达式实际上是一个匿名函数，它更像是一个匿名内部类，但是比匿名内部类更加简洁；
 * lambda表达式通常用来实现函数式接口，函数式接口就是只有一个抽象方法的接口，具有default默认实现的方法不计入抽象方法，
 * 如果接口中的抽象方法重写了Object中的方法，那么也不会计入在内，因为实现接口的类默认都实现了Object的方法；
 * @FunctionalInterface 通常用来表示一个接口是否是函数式接口
 * java大多数的函数式接口都在java.util.function包中，也有一些不在的，比如Comparator
 */

public class LambdaTest {

    public static void main(String[] args) {

        NoReturnNoParam noReturnNoParam = () -> System.out.println("我没有参数，方法体中只有一行代码，可以省略{}");
        noReturnNoParam.test();

        NoReturnSingleParam noReturnSingleParam = a -> System.out.println(a + "我只有一个参数可以省略()");
        noReturnSingleParam.test(5);

        NoReturnMultipleParam noReturnMultipleParam = (a, b) -> System.out.println(a - b);
        noReturnMultipleParam.test(1,2);

        ReturnNoParam returnNoParam = () -> "我只有返回值没有其他代码，连return都可以省略啦";
        System.out.println(returnNoParam.test());

        ReturnSingleParam returnSingleParam = a -> a;
        System.out.println(returnSingleParam.test(1));

        ReturnMultipleParam returnMultipleParam = (a, b) -> a - b;
        System.out.println(returnMultipleParam.test(2,1));

    }
}


@FunctionalInterface
interface NoReturnNoParam{
    void test();
}

@FunctionalInterface
interface NoReturnSingleParam{
    void test(int a);
}

@FunctionalInterface
interface NoReturnMultipleParam{
    void test(int a, int b);
}

@FunctionalInterface
interface ReturnNoParam{
    String test();
}

@FunctionalInterface
interface ReturnSingleParam{
    int test(int a);
}

@FunctionalInterface
interface ReturnMultipleParam{
    int test(int a, int b);
}
