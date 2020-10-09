package com.fzw.io01;

import java.io.*;

/**
 * @Auther: fzw
 * @version: 1.0    利用FileReader，FileWriter文件复制
 */
public class test03 {
    //这是main方法,程序的入口:
    public static void main(String[] args) throws IOException {
        //1.有一个源文件
        File f = new File("d:\\test.txt");

        //2.有一个目标文件：
        File f1 = new File("d:\\fan.txt");
        //3.搞一个输入的管 怼到源文件上：
        FileReader fr = new FileReader(f);
        //4.搞一个输出的管，怼到目标文件上：
        FileWriter fw = new FileWriter(f1);
        //5.开始动作：
        //方式1：一个字符一个字符的复制：
        /*int n = fr.read();
        while(n != -1){
            fw.write(n);
            n = fr.read();
        }*/
        /*//方式2：利用缓冲字符数组：
        char[] ch = new char[5];
        int len = fr.read(ch);
        while(len != -1){
            fw.write(ch, 0, len);
            len = fr.read(ch);
        }*/
        //方式3：利用缓冲字符数组，将数组转为String写出。
        char[] ch = new char[5];
        int len = fr.read(ch);
        while(len!=-1){
            String s = new String(ch,0,len);
            fw.write(s);
            len = fr.read(ch);
        }
        //6.关闭流：(关闭流的时候，倒着关闭，后用先关)
        fw.close();
        fr.close();
    }
}
