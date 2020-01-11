package com.mak.stream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperator {


    public static List<Integer> getList() {
        List<Integer> list = new ArrayList();
        for (int i = 0; i < 5; i++)
            list.add(i);
        return list;
    }

    public static void main(String[] args) {

        //flatMap
        Stream.of(getList(),getList()).flatMap(Collection::stream).distinct().forEach(System.out::println);
        //也可以先转换成数组
        Stream.of(getList(),getList()).map(val->val.toArray(new Integer[0])).flatMap(Arrays::stream).distinct().forEach(System.out::println);
        System.out.println("===============================================");
        Stream<String> stream = Stream.of("Hello world","Hello java","java world");
        stream.map(val->val.split(" ")).flatMap(Arrays::stream).distinct().forEach(System.out::println);
        //System.out.println(stream.collect(Collectors.counting()));         3
        //System.out.println(stream.count());                                3


    }
}
