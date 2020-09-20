package com.fze.test01;


import java.util.Date;

/**
 * @Auther: fzw
 * @Date: 2020/9/20 - 09 - 20 - 15:01
 * @Description: com.fze.test01
 * @version: 1.0 Java.util.Date类
 */
public class Test02 {
    //这是main方法,程序的入口:
    public static void main(String[] args) {
        Date d = new Date();
        //显示日期
        System.out.println(d);
        System.out.println(d.toString());
        System.out.println(d.toGMTString());
        //获取年份
        System.out.println(d.getYear() + 1900);
        //获得月份
        System.out.println(d.getMonth() + 1);
        //返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
        System.out.println(d.getTime());
        //这个更常用，因为他是静态的，可以类名。方法名调用
        System.out.println(System.currentTimeMillis());
    }
}
