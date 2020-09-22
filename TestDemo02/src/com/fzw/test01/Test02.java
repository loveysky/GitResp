package com.fzw.test01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

/**

 * @Description: com.fzw.test01
 * @version: 1.0  //格式化类：DateTimeFormatter 将日期格式化，可以自定义自己喜欢的格式
 */
public class Test02 {
    //这是main方法,程序的入口:
    public static void main(String[] args) {
        //格式化类：DateTimeFormatter
        //方式一:预定义的标准格式。如: ISO_LOCAL_DATE_TIME; ISO_LOCAL_DATE; IS0_LOCAL_TIME
        DateTimeFormatter df1 = DateTimeFormatter.ISO_DATE_TIME;
        //df1就可以帮我们完成LocalDateTime和String之间的相互转换：

        //LocalDateTime-->String:
        LocalDateTime now = LocalDateTime.now();
        String s1 = df1.format(now);
        System.out.println(s1);

        //String--->LocalDateTime  字符串的格式得一模一样，否则抛异常
        TemporalAccessor t1 = df1.parse("2020-06-15T15:02:51.29");
        System.out.println(t1);

        //方式二:本地化相关的格式。如: oflocalizedDateTime()
        //参数：FormatStyle.LONG / FormatStyle.MEDIUM / FormatStyle.SHORT
        //FormatStyle.LONG :2020年6月15日 下午03时17分13秒
        //FormatStyle.MEDIUM: 2020-6-15 15:17:42
        //FormatStyle.SHORT:20-6-15 下午3:18
        DateTimeFormatter df2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);

        //LocalDateTime-->String:
        LocalDateTime now1 = LocalDateTime.now();
        String str2 = df2.format(now1);
        System.out.println(str2);
        //String--->LocalDateTime
        TemporalAccessor parse1 = df2.parse("20-6-15 下午3:18");
        System.out.println(parse1);


        //方式三: 自定义的格式。如: ofPattern( "yyyy-MM-dd hh:mm:ss") ---》重点，以后常用
        DateTimeFormatter df3 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        //LocalDateTime-->String:
        LocalDateTime now2 = LocalDateTime.now();
        String format = df3.format(now2);
        System.out.println(format);//2020-06-15 03:22:03
        //String--->LocalDateTime
        TemporalAccessor parse2 = df3.parse("2020-06-15 03:22:03");
        System.out.println(parse2);


    }
}
