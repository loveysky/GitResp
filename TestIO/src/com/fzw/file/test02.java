package com.fzw.file;

import java.io.File;

/**
 * @Auther: fzw
 * @Date: 2020/10/9 - 10 - 09 - 1:02
 * @Description: com.fzw.file
 * @version: 1.0  对目录进行操作
 */
public class test02 {
    //这是main方法,程序的入口:
    public static void main(String[] args) {
        //将目录封装为File类的对象：
        File f = new File("D:\\IDEA_workspace");
        System.out.println("文件是否可读：" + f.canRead());
        System.out.println("文件是否可写：" + f.canWrite());
        System.out.println("文件的名字："+f.getName());
        System.out.println("上级目录：" + f.getParent());
        System.out.println("是否是一个目录：" + f.isDirectory());
        System.out.println("是否是一个文件：" + f.isFile());
        System.out.println("是否隐藏：" + f.isHidden());
        System.out.println("文件的大小：" + f.length());
        System.out.println("是否存在：" + f.exists());
        System.out.println("绝对路径：" + f.getAbsolutePath());
        System.out.println("相对路径：" + f.getPath());
        System.out.println("toString:" + f.toString());

        //跟目录相关的方法：
        File f2 = new File("d:\\a\\c\\e");
        //创建目录：
        //创建单层目录
        f2.mkdir();
        //创建多层目录
        f2.mkdirs();

        //删除：如果是删除目录的话，只会删除一层，并且前提：这层目录是空的，里面没有内容，如果内容就不会被删除
        f2.delete();

        //查看：
        File[] files = f.listFiles();
        for(File file:files){
            System.out.println(file.getName()+","+file.getAbsolutePath());
        }
    }
}
