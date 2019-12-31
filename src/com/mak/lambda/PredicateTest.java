package com.mak.lambda;

import java.util.function.Predicate;

public class PredicateTest {

    //判断字符串长度
    public static Boolean judge(String str, Predicate<String> predicate) {
        return predicate.test(str);
    }

    //&& 短路与 判断是否是指定字符串，如果是再判断其长度,不是则直接返回false;
    public static Boolean and(String str, Predicate<String> predicate, Predicate<String> other) {
        return predicate.and(other).test(str);
    }

    // ||或操作

    public static Boolean or(String str, Predicate<String> predicate, Predicate<String> other) {
        return predicate.or(other).test(str);
    }

    //取反
    public static Boolean negate(String str, Predicate<String> predicate) {
        return predicate.negate().test(str);
    }


    public static void main(String[] args) {

        String str = "Lambda Expression";

        System.out.println(judge(str, a -> a.length() > 5));

        System.out.println(and(str, a -> "kun".equals(a), a -> a.length() > 5));

        System.out.println(or(str, a -> a.length() > 5, a -> "kun".equals(a)));

        System.out.println(negate(str, a -> a.length() > 5));

    }
}
