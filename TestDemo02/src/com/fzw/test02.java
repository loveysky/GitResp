package com.fzw;

/**
 * @Auther: fzw
 * @version: 1.0  Math类
 *【1】直接使用，无需导包：
 *【2】final修饰类，这个类不能被继承
 *【3】构造器私有化，不能创建Math类的对象：
 *【4】Math内部的所有的属性，方法都被static修饰：类名.直接调用，无需创建对象：
 *【5】常用方法：
 */
public class test02 {
    //这是main方法,程序的入口:
    public static void main(String[] args) {
        //常用属性：
        System.out.println(Math.PI);
        //常用方法：
        System.out.println("随机数: " + Math.random());
        System.out.println("绝对值: " + Math.abs(-120));
        System.out.println("向上取值: " + Math.ceil(9.3));
        System.out.println("向下取值: " + Math.floor(9.8));
        System.out.println("四舍五入: " + Math.round(5.6));
        System.out.println("取大的那个值: " + Math.max(5, 15));
        System.out.println("取小的那个值: " + Math.min(5.84, 5.69));

    }
}
