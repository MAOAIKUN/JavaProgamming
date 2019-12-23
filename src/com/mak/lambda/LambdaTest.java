package com.mak.lambda;

import java.util.function.Function;

public class LambdaTest {

    public static void main(String[] args) {

        Function<Integer,Integer> function = val -> val*2;
    }
}
