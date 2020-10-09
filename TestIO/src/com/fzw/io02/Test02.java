package com.fzw.io02;

import java.io.*;

/**
 * @Auther: fzw
 * @version: 1.0 利用 字节流 完成图片的复制：    读入一个字节，写出一个字节：
 */
public class Test02 {
    //这是main方法,程序的入口:
    public static void main(String[] args) throws IOException {
        //功能：完成图片的复制：
        //1.有一个源图片
        File f = new File("C:\\Users\\Fan\\Desktop\\新建文件夹\\lolimages\\33.jpg");

        //2.有一个目标图片：
        File f1 = new File("C:\\Users\\Fan\\Desktop\\66.jpg");
        //3.有一个输入的管道 怼 到 源文件：
        FileInputStream fis = new FileInputStream(f);
        //4.有一个输出的管道 怼到  目标文件上：
        FileOutputStream fos = new FileOutputStream(f1);
        //5.开始复制：（边读边写）
        byte[] b = new byte[1024 * 6];
        int len = fis.read(b);
        while(len != -1){
            fos.write(b, 0, len);
            len = fis.read(b);
        }
        //6.关闭流：(倒着关闭流，先用后关)
        fos.close();
        fis.close();


    }
}
