package com.fzw.test01;

import java.util.Arrays;

/**
 * @Auther: fzw
 * @Date: 2020/10/6 - 10 - 06 - 20:52
 * @Description: com.fzw.test01
 * @version: 1.0    String类的常用方法
 */
public class TestString {
    //这是main方法,程序的入口:
    public static void main(String[] args) {
        //利用构造器来创建对象
        String s1 = new String();
        String s2 = new String("abc");
        String s3 = new String(new char[]{'c', 'd', 'e'} );

        //常用方法
        String s4 = "apple";
        //1.获取字符串的长度
        System.out.println("字符串的长度为:" + s4.length());
        //2.判断字符串是否为空
        System.out.println("判断字符串是否为空: " + s4.isEmpty());
        //3.获取字符串的下标对应的字符
        System.out.println("获取字符串的下标对应的字符: " + s4.charAt(3));

        //4.equals方法：
        String s5 = "abc";
        String s6 = "abc";
        System.out.println(s5.equals(s6));

        //5.String类实现了Comparable，里面有一个抽象方法叫compareTo，所以String中一定要对这个方法进行重写
        String s7 = "abed";
        String s8 = "abc";
        System.out.println(s7.compareTo(s8));

        System.out.println("====================================================");

        //6.字符串的截取
        String s9 = "watermelon";
        System.out.println(s9.substring(3)); //从3到最后
        System.out.println(s9.substring(3, 6)); //(3, 6]

        //7.字符串的合并/拼接操作：
        String s10 = "Big ";
        System.out.println(s10.concat(s9)); //s10合并s9

        //8.字符串中的字符的替换：
        String s11 = "a12a3ba45a6ca";
        System.out.println(s11.replace('a', 'o')); //将a替换为o

        //9.按照指定的字符串进行分裂为数组的形式：
        String s12 = "a-b-c-d-e-f";
        String[] str = s12.split("-");
        System.out.println(Arrays.toString(str));

        //10.转大小写的方法：
        String s13 = "abc";
        System.out.println(s13.toUpperCase());
        System.out.println(s13.toUpperCase().toLowerCase());

        //11.去除首尾空格：
        String s14 = "    a   b   c    ";
        System.out.println(s14.trim());

        //12.toString()
        String s15 = "abc";
        System.out.println(s15.toString());

        //13.转换为String类型：
        System.out.println(String.valueOf(false));  //boolean类型转String类型
        System.out.println(String.valueOf(132));    //int类型转String类型
        System.out.println(String.valueOf(63.25));  //double类型转String类型



    }
}
