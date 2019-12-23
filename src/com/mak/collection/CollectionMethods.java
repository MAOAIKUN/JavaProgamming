package com.mak.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class CollectionMethods {

    public static void listMethod(){
        ArrayList<String> arrayList = new ArrayList<>();
        //Collections.addAll(Collection,T... );
        Collections.addAll(arrayList,new String[]{"i","am","mak"});
        Collections.addAll(arrayList,"who","are","you");
        Collections.addAll(arrayList,"i am yue".split(" "));
        System.out.println("test start");
        System.out.println(arrayList);
        arrayList.add("~");
        //index,是在改索引元=元素之前插入元素
        arrayList.add(6,"?");
        int firstIndex = arrayList.indexOf("i");
        System.out.println(arrayList);
        System.out.println("firstIndex:"+firstIndex);
        System.out.println("get first element:"+arrayList.get(0));
        System.out.println("will execute clear() method");
        arrayList.clear();
        System.out.println("after clear");
        System.out.println(arrayList);
        System.out.println("add elements");
        LinkedList<String> linkedList = new LinkedList<>();
        Collections.addAll(linkedList,"add new elements".split(" "));
        arrayList.addAll(linkedList);
        System.out.println(arrayList);
        //都是true啊
        System.out.println(arrayList.contains("add"));
        String add = new String("add");
        System.out.println(arrayList.contains(add));

    }

    public static void main(String[] args) {
        listMethod();
    }
}
