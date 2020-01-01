package com.mak.operator;



public class Operator {


    public static void main(String[] args) {

        //递增递减运算符
        //在做赋值操作的时候，赋值的是备份空间的值，详情请参阅CSDN中我的博客；
        int a = 1;
        a = a--;
        System.out.println(a);

        //直接常量
        //可以是十进制，八进制，十六进制
        //八进制
        int v1 = 017;
        //输出十进制
        System.out.println(v1);
        //输出二进制
        System.out.println(Integer.toBinaryString(v1));
        //十六进制
        int v2 = 0x17;
        System.out.println(v2);
        System.out.println(Integer.toBinaryString(v2));

        //指数计数法
        //默认是double类型的
        double v3 = 1e-4;
        System.out.println(v3);

        //移位操作符
        //移位的时候二进制要够四位
        int v4 = 5;
        //2^3 = 8扩大八倍
        v4 = v4 << 3;
        System.out.println(v4);
        int v5 = 5;
        //缩小一倍
        v5 = v5 >> 1;
        System.out.println(v5);

    }
}
