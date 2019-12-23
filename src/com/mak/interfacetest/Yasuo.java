package com.mak.interfacetest;

/**
 * 1.在java8中,接口中可以有默认方法，默认方法就是有默认实现，需要有关键字default作修饰
 * 默认方法实现接口的类可以不实现，不实现的话顾名思义就是调用默认的实现；
 *
 * 2.如果两个接口中有相同的方法名并且这两个方法都是默认方法，类同时实现这两个接口，且不实现这同名的默认方法
 * 那么这两个接口中的该方法只能以重载的方式存在，不然会报错
 * 当然你还可以重写这个方法来解决冲突；
 *
 * 3.java8中，允许接口中有静态方法，这样可以将工具方法从实现类中迁移，使之更通用；
 *
 *
 */

public class Yasuo implements Skills,Expression {

    @Override
    public void Q() {
        System.out.println("hasaki");

    }

    @Override
    public void E() {
        System.out.println("eeee");

    }




    public static void main(String[] args) {
        Yasuo yasuo = new Yasuo();
        yasuo.D();
        yasuo.D(7);
        yasuo.F();
        Expression.staticFunc();
    }
}
