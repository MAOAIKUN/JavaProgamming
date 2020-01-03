package com.mak.io;


import java.util.Properties;
import java.util.Set;

/**
 * getProperties() 获取所有系统变量
 * getProperty(String key)  获取指定key的value
 * getenv() 获取所有系统环境变量
 * getenv(String key)   获取指定key的value
 *
 */

public class SystemTest {

    public static void main(String[] args) {
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.version"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("user.dir"));
        Properties sysProps = System.getProperties();
//        Set<String> stringSet = sysProps.stringPropertyNames();
//        for (String s : stringSet) {
//            System.out.println(s);
//        }
//        Set set = sysProps.keySet();
//        for (Object o : set) {
//            System.out.println(o);
//        }
        System.out.println(System.getenv("JAVA_HOME"));
    }
}
