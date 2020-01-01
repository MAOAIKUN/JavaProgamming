package com.mak.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.TreeSet;

public class LambdaInCollection {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,1,3,2,7,5,6,4);
        //使用foreach遍历输出
        //foreach()的参数是Consumer，它是一个函数式接口，实现它的void accept(T t)即可
        arrayList.forEach(System.out::println);
        //也可以添加一个输出条件
        System.out.println("============================");
        arrayList.forEach(ele ->{
            if(ele % 2 == 0)
                System.out.println(ele);
        });

        System.out.println("=============================");
        //现在给他们进行一个排序
        //sort()的参数是Comparator，它是一个函数式接口，但是它里面有两个抽象方法，一个是Object中的equals()方法不算的哦，切记；
        //所以实现该函数式接口中的 int compare(T o1,T o2)即可；
        arrayList.sort((o1,o2) -> o1 - o2);
        arrayList.forEach(System.out::println);

        //删除元素，要想安全的删除一个元素可以使用iterator，本例中还可以使用ListIterator，但这显然是有点麻烦的
        System.out.println("===============================");
//        ListIterator<Integer> listIterator = arrayList.listIterator();
//        while (listIterator.hasNext()){
//            if(listIterator.next() % 2 == 0)
//                listIterator.remove();
//        }


        //removeIf()的参数是Predicate,它是一个函数式接口，只需要实现它的 boolean test(T t)方法即可；
        arrayList.removeIf(ele -> ele % 2 == 0);
        arrayList.forEach(System.out::println);

        System.out.println("**************************************************");
        //下面来写一下TreeSet中的排序
        TreeSet<Student> studentTreeSet = new TreeSet<>(((o1, o2) -> o1.getAge() - o2.getAge()));
        studentTreeSet.add(new Student("carry c",28));
        studentTreeSet.add(new Student("坤子哥",21));
        studentTreeSet.add(new Student("辉子哥",25));

        studentTreeSet.forEach(System.out::println);
    }
}

class Student{
    private String name;
    private Integer age;

    public Student() {
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
