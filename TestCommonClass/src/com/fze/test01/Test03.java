package com.fze.test01;


import java.sql.Date;

/**
 * @Auther: fzw
 * @Date: 2020/9/20 - 09 - 20 - 15:13
 * @Description: com.fze.test01
 * @version: 1.0 Java.sql.Date
 */
public class Test03 {
    //这是main方法,程序的入口:
    public static void main(String[] args) {
        //java.sql.Date里没有空的构造函数
        Date d = new Date(1592055964263L);
        //只显示年月日，不显示时间
        System.out.println(d);
        //==================================================
        //java.sql.Date和java.util.Date相互转换：

        //【1】util--->sql:
        java.util.Date date = new java.util.Date();

        //利用构造器
        Date d2 = new Date(date.getTime());

        //【2】sql-->util: 直接父类引用指向子类对象
        java.util.Date d4 = new Date(1592055964263L);
        java.util.Date d5 = d2;

        //[3]String--->sql.Date:
        Date d6 = Date.valueOf("2020-9-20");
        System.out.println(d6);

    }
}


