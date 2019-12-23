package com.mak.modifier1;

/**
 * 主要关注不同包的子类和父类，在不同包的情况下，只有在子类的内部才可以访问父类的protected
 * 不在子类的子类对象不能调用protected,同包下在不在子类都可以访问，对于同包的其他类来说，他是默认访问权限；
 *
 */
public class NotInSon {

    public static void main(String[] args) {
        DisPackageSonModifier disPackageSonModifier = new DisPackageSonModifier("保护", 5);
        System.out.println(disPackageSonModifier.getPriority());
    }
}
