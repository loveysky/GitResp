package com.fze.test01;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: fzw
 * @Date: 2020/9/20 - 09 - 20 - 15:59
 * @Description: com.fze.test01
 * @version: 1.0 SimpleDateFormat
 */
public class Test04 {
    //这是main方法,程序的入口:
    public static void main(String[] args) {
        //String---> java.util.Date
        //分解： String--> java.sql.Date--> java.util.Date

        //String--> java.sql.Date
        java.sql.Date date = java.sql.Date.valueOf("2020-9-20");
        //java.sql.Date--> java.util.Date
        Date d2 = date;
        System.out.println(d2.toString());
        //======================================================================================

        //上面的代码有局限性，字符串的格式只能是年-月-日拼接的形式，换成其它类型，就会出现异常：
        // 引入新的类：SimpleDateFormat
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //String---> java.util.Date
        try {
            Date d = df.parse("2020-9-20 16:36:20");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date.toString());


    }

}
