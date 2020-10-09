package com.fzw.file;

import java.io.File;

/**
 * @Auther: fzw
 * @Date: 2020/10/9 - 10 - 09 - 0:51
 * @Description: com.fzw.file
 * @version: 1.0   对文件进行操作
 */
public class test01 {
    //这是main方法,程序的入口:
    public static void main(String[] args) {
        //将文件封装为一个File类的对象：
        File f1 = new File("d/test.txt");
        File f2 = new File("d\\test.txt");
        //File.separator属性帮我们获取当前操作系统的路径拼接符号
        //在windows，dos下，系统默认用“\”作为路径分隔符 ，在unix，url中，使用“/”作为路径分隔符。
        File f3 = new File("d:" + File.separator + "test.txt");

        //常用方法：
        System.out.println("文件是否可读："+f1.canRead());
        System.out.println("文件是否可写："+f1.canWrite());
        System.out.println("文件的名字："+f1.getName());
        System.out.println("上级目录："+f1.getParent());
        System.out.println("是否是一个目录："+f1.isDirectory());
        System.out.println("是否是一个文件："+f1.isFile());
        System.out.println("是否隐藏："+f1.isHidden());
        System.out.println("文件的大小："+f1.length());
        System.out.println("是否存在："+f1.exists());
        System.out.println(f1 == f2);//比较两个对象的地址
        System.out.println(f1.equals(f2));//比较两个对象对应的文件的路径

        //跟路径相关的：
        //绝对路径指的就是：真实的一个精准的，完整的路径
        System.out.println("绝对路径："+f1.getAbsolutePath());
        //相对路径：有一个参照物，相对这个参照物的路径。
        //在main方法中，相对位置指的就是：D:\IDEA_workspace\TestJavaSE
        //在junit的测试方法中，相对路径指的就是模块位置
        System.out.println("相对路径："+f1.getPath());
        //toString的效果永远是  相对路径
        System.out.println("toString:"+f1.toString());


    }

}
