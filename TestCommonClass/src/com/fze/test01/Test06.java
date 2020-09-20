package com.fze.test01;

import sun.util.calendar.BaseCalendar;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @Auther: fzw
 * @version: 1.0 需求：根据日期打印出一个本月的日历
 */
public class Test06 {
    //这是main方法,程序的入口:
    public static void main(String[] args) {
        //录入一个字符串的日期
        Scanner input = new Scanner(System.in);
        System.out.print("请输入您想要查看的日期：(提示：请按照例如2018-5-12的格式书写)");
        String strDate = input.next();

        //将字符串日期转化为Calendar（String-->Calendar）
        //(1)先将字符串转成sqlData类型
        java.sql.Date data = java.sql.Date.valueOf(strDate);
        //(2)再将sqlDate类型转换为Calendar类型
        Calendar cal = Calendar.getInstance();
        cal.setTime(data);

        //后续操作
        //星期提示：
        System.out.println("日\t一\t二\t三\t四\t五\t六\t");
        //获取本月最大的天数
        int maxDay = cal.getActualMaximum(Calendar.DATE);
        //获取当前日期中的日
        int nowDay = cal.get(Calendar.DATE);
        //将日期调为本月的第一天
        cal.set(Calendar.DATE, 1);
        //获取这个一号是本月的第几天
        int num = cal.get(Calendar.DAY_OF_WEEK);
        //前面空出来的天数为：
        int day = num - 1;
        //在日期前面将空格打印出来
        for (int i = 1; i <= day ; i++) {
            System.out.print("\t");
        }
        //引入一个计数器
        int count = 0;
        //将空出来的日子加进计数器里
        count = count + day;
        //5.遍历:从一号到maxDay号进行遍历
        for(int i = 1; i <= maxDay; i++){
            if(i == nowDay){ //如果遍历的i和当前日子一样的话，后面多拼一个*
                System.out.print(i + "*" + "\t");
            }else{
                System.out.print(i + "\t");
            }
            count ++;
            if(count % 7 == 0){//打印七个换行
                System.out.println();
            }
        }
    }

}
