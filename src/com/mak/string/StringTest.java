package com.mak.string;

import java.util.Arrays;

public class StringTest {

    public static void main(String[] args) {

        String s = "face the wind";
        String m = "face the wind";
        System.out.println(s.charAt(0));  //f
        System.out.println(s.contains("wind")); //true
        System.out.println(s.contentEquals(m)); //true
        System.out.println(s.toCharArray()); //输出的是字符串
        System.out.println(Arrays.toString(s.toCharArray())); //['f','a','c','e',...]
        System.out.println(s.substring(9).equalsIgnoreCase("WIND")); //true
        System.out.println(s.substring(0, 4).equals("face")); //true
        System.out.println(s.substring(0, 0).equals("f")); //false  [start,end)
        System.out.println(s.startsWith("fa")); //true
        System.out.println(s.endsWith("d")); //true
        System.out.println(s.indexOf("e"));  // 3
        System.out.println(s.lastIndexOf("e")); // 7
        s = s.concat(" you have been slain ");
        System.out.println(s.length());
        System.out.println(s);
        s = s.trim();
        System.out.println(s.length());
        s = s.replace("f", "F");
        System.out.println(s);
        s = s.replace("wind","WIND");
        System.out.println(s);
        String[] split = s.split(" ");
        System.out.println(Arrays.toString(split));

    }
}
