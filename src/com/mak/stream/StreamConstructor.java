package com.mak.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * Stream有几个构造方法
 * of(T...)
 * of(T)
 * iterate(seed,Function)
 * generate(Supplier)
 *
 * 要注意的是iterate和generate产生的都是无限流，都要加limit()方法去限制个数
 * 这些我感觉我用的应该不会很多，因为我多半都会在集合中去获取流
 *
 * 使用flatMap将集合或者数组扁平化 可以调用Collections或者Arrays中的stream方法
 *
 *
 */

public class StreamConstructor {


    public int random(){
        return new Random().nextInt(9);
    }

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(new Integer[]{1,2,3,4,5,6});
        List<Double> collect = stream.filter(val -> val < 4).map(val -> Math.pow((double) val, 2)).collect(Collectors.toList());
        collect.stream().forEach(System.out::println);

        Stream.iterate(1,val -> val+2).limit(4).forEach(System.out::println);
        System.out.println("----------------------------------------------------");
        Stream.generate(new StreamConstructor()::random).limit(5).distinct().forEach(System.out::println);
        System.out.println("=====================================================");
       // Stream.of(getList(),getList()).forEach(list -> list.forEach(System.out::println));
        //Stream.of(getList(),getList()).flatMap(Collection::stream).distinct().forEach(System.out::println);
    }
}
