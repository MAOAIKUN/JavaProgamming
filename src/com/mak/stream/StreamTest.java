package com.mak.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {
        //Stream
        //List list = new ArrayList();
        //在Collection接口里的
        //list.stream();

        //IntStream.range(3,7).forEach(System.out::println);

        IntStream stream = IntStream.of(new int[]{1,2});
        System.out.println(stream.map(item -> item * 2).sum());

        List<Integer> list = Arrays.asList(1,2);
        System.out.println(list.stream().map(i -> 2 * i).reduce(0,Integer::sum));
//        Consumer<java.lang.String> consumer = str -> System.out.println(str);
//        consumer.accept("hello");

        Stream<String> stringStream = Stream.of("hello","world");
        //List<String> list1 = stringStream.collect(Collectors.toList());
        //Collectors.toList()底层实际上还是调用了下main这个原始的方法，该方法有三个参数
        /*
        param1: 要返回的一个集合
        param2: 将流里面的元素放到一个集合里
        param3: 这里的vList是个参数，返回的是vList1.addAll(),add了vList,vList1就是返回的集合
         */
//        ArrayList<String> list1 = stringStream.collect(() -> new ArrayList<String>(), (vList, item) -> vList.add(item),
//                (vList1, vList2) -> vList1.addAll(vList2));
//        ArrayList<Object> list1 = stringStream.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
//        list1.forEach(System.out::println);
//        ArrayList<String> list1 = stringStream.collect(Collectors.toCollection(ArrayList::new));
//        list1.forEach(System.out::println);
        //-------------
        //String string = stringStream.collect(StringBuilder::new,StringBuilder::append,StringBuilder::append).toString();
        //String string = stringStream.collect(Collectors.joining());
        //System.out.println(string);
        //stringStream.flatMap()
    }
}
