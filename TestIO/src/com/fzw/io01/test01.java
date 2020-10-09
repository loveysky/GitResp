package com.fzw.io01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Auther: fzw
 * @version: 1.0  测试字符输入流 Reader
 */
public class test01 {
    //这是main方法,程序的入口:
    public static void main(String[] args)  {
        //文件--》程序：
        //1.有一个文件：----》创建一个File类的对象
        File f = new File("d:\\test.txt");
        //2.创建一个FileReader的流的对象
        FileReader fr = null;
        try {
            fr = new FileReader(f);
            //方式2：一次性读取五个字符，没读完在读五个字符
            char[] ch = new char[5]; //缓冲数组
            int len = fr.read(ch); //一次读取五个:返回值是这个数组中 的有效长度
            while(len != -1){
                //输出读到的每一个字符
                for(int i = 0; i < len; i++){
                    System.out.println(ch[i]);
                }
                len = fr.read(ch);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            //4.关闭流
            // 流，数据库，网络资源，靠jvm本身没有办法帮我们关闭，此时必须程序员手动关闭：
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //3.读取动作

        //方式1：一个字符一个字符的读
        /*int n = fr.read();
        while(n != -1){
            System.out.println(n);
            n = fr.read();
        }*/




    }
}
