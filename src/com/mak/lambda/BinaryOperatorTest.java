package com.mak.lambda;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorTest {

    //传递行为，完成四则运算

    public static Integer calculate(int a,int b,BinaryOperator<Integer> binaryOperator){
        return binaryOperator.apply(a,b);

    }

    //比较两个数的大小,并返回最小值

    public static Integer compare(int a, int b, Comparator<Integer> comparator){
        return BinaryOperator.minBy(comparator).apply(a,b);
    }

    public static void main(String[] args) {

        int m = 10,n = 4;
        System.out.println(calculate(m, n, (a, b) -> a + b));
        System.out.println(calculate(m,n,(a,b) -> a / b));
        System.out.println(calculate(m,n,(a,b) -> a * b));

        System.out.println(compare(m,n,(o1, o2) -> o1 - o2));
    }
}
