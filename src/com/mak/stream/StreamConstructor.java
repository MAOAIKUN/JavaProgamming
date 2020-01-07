package com.mak.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamConstructor {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(new Integer[]{1,2,3,4,5,6});
        List<Double> collect = stream.filter(val -> val < 4).map(val -> Math.pow((double) val, 2)).collect(Collectors.toList());
        collect.stream().forEach(System.out::println);
    }
}
