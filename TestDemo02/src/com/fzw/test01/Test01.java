package com.fzw.test01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @Description: com.fzw.test01
 * @version: 1.0 LocalDate年月日/LocalTime时分秒/LocalDateTime年月日时分秒
 * LocalDateTime类是被final修饰的，不能被继承
 */
public class Test01 {
    //这是main方法,程序的入口:
    public static void main(String[] args) {
        //完成实例化：
        //方法1：now()--获取当前的日期，时间，日期+时间
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate); //年月日
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime); //时分秒
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime); //年月日时分秒

        //方法2：of()--设置指定的日期，时间，日期+时间
        LocalDate localDate1 = LocalDate.of(2020,5,9);
        System.out.println(localDate1);
        LocalTime localTime1 = LocalTime.of(23,18,32);
        System.out.println(localTime1);
        LocalDateTime localDateTime1 = LocalDateTime.of(2020,5,18,23,45,18);
        System.out.println(localDateTime1);

        //LocalDate,LocalTime用的不如LocalDateTime多
        //一些列常用的get***
        System.out.println(localDateTime.getYear()); //2020
        System.out.println(localDateTime.getMonth());//SEPTEMBER
        System.out.println(localDateTime.getDayOfMonth());//22
        System.out.println(localDateTime.getDayOfWeek());//TUESDAY
        System.out.println(localDateTime.getHour());//23
        System.out.println(localDateTime.getMinute());//24
        System.out.println(localDateTime.getSecond());//6

        //不是set方法，叫with
        //体会：不可变性 localDateTime调用方法，结果传给了新的localDateTime2
        LocalDateTime localDateTime2 = localDateTime.withYear(1776);
        System.out.println(localDateTime2);
        //只要已经存在的localDateTime都不能被改变，只能创建新的对象
        LocalDateTime localDateTime3 = localDateTime.withDayOfYear(156);
        System.out.println(localDateTime3);

        //提供了加减的操作：
        //加：
        LocalDateTime localDateTime4 = localDateTime.plusYears(5);//加5年
        System.out.println(localDateTime);
        System.out.println(localDateTime4);
        //减：
        LocalDateTime localDateTime5 = localDateTime.minusMonths(15);//减15个月
        System.out.println(localDateTime);
        System.out.println(localDateTime5);

    }
}
