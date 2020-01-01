package com.mak.lambda;
import java.util.Optional;


/**
 * Optional用来规避空指针异常，使用Optional应采用函数式编程的方式，不要将Optional作为方法参数；
 */
public class OptionalTest {

    public static void main(String[] args) {

        //静态的工厂方法 of()一定要有值 empty()空值 ofNullable()可空可不空
        Optional<String> optional = Optional.ofNullable("hello");
        //有值就输出，无值没有输出
        optional.ifPresent(System.out::println);

        //对值进行筛选，没有值或者不满足条件返回Optional.empty，那满足提交返回Optional[value]
        System.out.println(optional.filter(item -> item.length()>3));

        System.out.println("===========================================");
        Optional<String> optional1 = Optional.empty();
        System.out.println(optional1.orElse("otherValue"));
        System.out.println(optional1.orElseGet(() -> "otherValue"));
    }
}
