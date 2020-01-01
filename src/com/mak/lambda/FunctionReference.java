package com.mak.lambda;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 方法引用：它的主要作用是利于修改，如果需要使用很多个lambda表达式去实现接口中的方法，
 * 如果修改了接口中的方法，那么每个lambda表达式都要进行修改，这显然很麻烦；
 * 方法引用提供了使用一个方法去避免这种麻烦操作，前提是引用的方法的参数类型，参数个数和返回值都要和接口中的一致；
 *
 * 方法签名一致就可以使用方法引用了；这里的方法签名指的是参数个数和参数类型，不包括方法名；
 *
 * 引用规则为：方法的归属者::方法名；
 * 如果引用的是构造方法规则会有点不同； 为:方法归属者::new；
 * 方法引用之后调用方法你要自己传参数，这样无参构造方法和有参构造方法就可以区分开了；
 *
 *
 * 方法引用有四种形式
 * 1.类名::静态方法名
 * 2.引用名::方法名
 * 3.类名:方法名      这个比较难理解，这个的方法参数与要实现的接口不一致；比如int compare(T o1, T o2);
 *                 一个方法为 compareByAge(Student other)则方法引用为 Student::compareByAge，如果上面的方法引用了这个，实际上是参数o1去调用了这个方法
 *                 即o1.compareByAge(o2)
 * 4.构造方法引用
 */

public class FunctionReference<T> {

    private static boolean func(int a) {
        System.out.println(a);
        return false;
    }

    private int  objectFunc(int b){
        System.out.println(b);
        return 1;
    }

    private  void change(T a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        Comparator comparator = FunctionReference::func;
        Comparator comparator1 = FunctionReference::func;
        Comparator comparator2 = new FunctionReference()::objectFunc;
        comparator.test(5);
        comparator1.test(2);
        comparator2.test(3);

        CreateObject createObject = ArrayList::new;
        ArrayList<Object> arrayList = createObject.getArrayList(8);
    }


}

@FunctionalInterface
interface Comparator {
    void test(int a);
}

@FunctionalInterface

interface CreateObject{
    ArrayList<Object> getArrayList(int a);
}
