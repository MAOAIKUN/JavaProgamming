package com.mak.verification;

import com.mak.modifier.Modifier;

/**
 * 断言 是用来判断一些值或者参数(比如判断方法参数是否符合要求)是否符合我们的预期
 * 如果不符合预期 将会报错 将抛出 AssertionError 异常。 AssertionError 是 Throwable 的派生类，因此不需要异常说明。
 * 语法
 * assert boolean-expression
 * assert boolean-expression : info
 * 后者可以加一些提示信息的字符串，会更好一点
 * 断言会在boolean-expression为false时执行
 *
 *开启断言
 * 手动开启：Run -> edit configuration -> 选择需要开启的类 -> 在 VM options中填入 -ea -> apply ok
 * 代码开启：通过获得ClassLoader对象，然后调用方法实现开启
 *
 * setDefaultAssertionStatus(boolean) -- 主类之后加载的类都开启断言
 * setPackageAssertionStatus(packageName,boolean) -- 指定包开启断言
 * setClassAssertionStatus(className,boolean)  -- 指定类开启断言
 *
 */

public class AssertTest {

    //用来判断改类是否开启了断言

    static {
        boolean assertStatus = false;
        assert assertStatus = true;
        if(!assertStatus){
            //抛出异常
            //throw new RuntimeException("断言未开启");

            //动态开启断言
            ClassLoader classLoader = ClassLoader.getSystemClassLoader();
            //setDefaultAssertionStatus 之后加载的类都将开启断言
            classLoader.setDefaultAssertionStatus(true);
            //setPackageAssertionStatus 指定一个包开启断言(前提是你的类要在主类的方法里跑，自己的方法里断言可不起作用)
            //classLoader.setPackageAssertionStatus("com.mak.verification",true);
            // setClassAssertionStatus 指定类开启断言
            //classLoader.setClassAssertionStatus("com.mak.verification.Load2",true);
        }

    }

    public static void main(String[] args) {

        //assert false;
        //assert false : "我开起了断言，你过不去的";
        System.out.println("你猜我会不会输出");
        new Load2().assertTest(null);
        //Modifier是不在一个包的类
        new Modifier().test();
        new PackageAssertionTest().test();
        new Load().assertTest();

//        Class clazz = Load2.class;
//        System.out.println(clazz.getName());
    }
}


class Load{
    public void assertTest(){
        assert false: "用代码动态开启断言";
    }
}

class Load2{
    public void assertTest(Object o){
        assert o != null : "可能没有给它开启断言";
    }
}
