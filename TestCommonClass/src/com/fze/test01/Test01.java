package com.fze.test01;

/**
 * @Auther: fzw
 * @Date: 2020/9/20 - 09 - 20 - 12:58
 * @Description: com.fze.test01
 * @version: 1.0 测试 Integer 包装类
 */
public class Test01 {
    //这是main方法,程序的入口:
    public static void main(String[] args) {
        //属性
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        //构造器
        //int类型作为构造器的参数：
        Integer i1 = new Integer(3);
        System.out.println(i1);
        //String类型作为构造器的参数：
        Integer i2 = new Integer("124");
        System.out.println(i2);

        //包装类特有的机制：自动装箱  自动拆箱
        //自动装箱
        Integer i3 = 13;
        System.out.println(i3);
        //自动拆箱
        Integer i4 = new Integer("456");
        int num = i4;
        System.out.println(i4);

        //方法
        //ValueOf() 将int类型转化为Integer:

        Integer i5 = Integer.valueOf(200);
        Integer i6 = Integer.valueOf(200);
        System.out.println(i5.equals(i6));
        //compareTo()方法: -1, 0, 1
        System.out.println(i5.compareTo(i6));

    }
}
