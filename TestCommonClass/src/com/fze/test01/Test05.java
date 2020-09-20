package com.fze.test01;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @Auther: fzw
 * @Date: 2020/9/20 - 09 - 20 - 16:38
 * @Description: com.fze.test01
 * @version: 1.0  Calendar  Calendar是一个抽象类，不可以直接创建对象
 */
public class Test05 {
    //这是main方法,程序的入口:
    public static void main(String[] args) {
        //GregorianCalendar()子类 extends Calendar（父类是一个抽象类）
        Calendar ca = new GregorianCalendar();
        //使用默认时区和语言环境获得一个日历  输出很长
        ca = Calendar.getInstance();
        System.out.println(ca);
        //==============================================

        //常用的方法：
        // get方法，传入参数：Calendar中定义的常量
        System.out.println(ca.get(Calendar.YEAR));//年
        System.out.println(ca.get(Calendar.MONTH));//月+1
        System.out.println(ca.get(Calendar.DATE));//日
        System.out.println(ca.getActualMaximum(Calendar.DATE));//获取当月日期的最大天数
        System.out.println(ca.getActualMinimum(Calendar.DATE));//获取当月日期的最小天数

        // set方法：可以改变Calendar中的内容
        ca.set(Calendar.YEAR, 2022);//改变年
        ca.set(Calendar.MONTH, 12);//改变月
        ca.set(Calendar.DATE, 10);//改变日期
        System.out.println(ca.toString());//输出
        //==================================================

        //String--->Calendar:

        //String--> java.sql.Date
        java.sql.Date date1 = java.sql.Date.valueOf("2020-5-12");
        //java.sql.Date--> Calendar
        ca.setTime(date1);
        System.out.println(ca);


    }
}
