package com.mak.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;
import java.util.function.Function;

public class LambdaTest {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,1,-1,9,4,5,6,8);
        arrayList.sort((o1, o2) -> o1 -o2);
        arrayList.forEach(System.out::println);
        System.out.println("------------------------------");
        arrayList.removeIf(item -> item % 2 ==0);
        arrayList.forEach(System.out::println);
    }
}
