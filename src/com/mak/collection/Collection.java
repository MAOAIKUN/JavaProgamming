package com.mak.collection;

import java.util.*;

public class Collection {

    //for-each
    public static void display(Iterable<Object> iterable){
        for (Object it:iterable) {
            System.out.println(it);
        }
    }

    //iterator
    public static void displayByIterator(Iterator<Object> iterator){
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    //listIterator
    public static void displayByListIterator(ListIterator<Object> listIterator){
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        Collections.addAll(list, "i am mak".split(" "));
        display(list);
        System.out.println("==========================");
        Iterator<Object> iterator = list.iterator();
        displayByIterator(iterator);


        System.out.println("=========================");
        ListIterator<Object> objectListIterator = list.listIterator(1);
        displayByListIterator(objectListIterator);

        //不管是在方法中执行还是在main方法中执行,ListIterator游标执行完后就会停留在那个地方
        System.out.println("===========================");
        while (objectListIterator.hasPrevious()){
            System.out.println(objectListIterator.previous());
        }


    }
}
