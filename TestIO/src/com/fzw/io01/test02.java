package com.fzw.io01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Auther: fzw
 * @version: 1.0 测试字符输出流 Writer
 */
public class test02 {
    //这是main方法,程序的入口:
    public static void main(String[] args) throws IOException {
        //1.有个目标文件：
        File f = new File("d:\\test.txt");

        //2.FileWriter管怼到文件上去：
        //用new构造时， 参数为true， 对原来的文件进行追加，而不是覆盖。
        //参数为false 或者不写时，相当于对源文件进行覆盖操作。
        FileWriter fw = new FileWriter(f,true);

        //3.开始动作：输出动作：
        String str = "mm66我爱你";
        //方式1：一个字符一个字符的向外输出：
        /*for(int i = 0; i < str.length(); i++){
            fw.write(str.charAt(i));
        }*/

        //方式2：将字符串向外输出：
        fw.write(str);

        //方式3：利用缓冲数组向外输出：
        char[] ch = str.toCharArray();
        fw.write(ch);

        //4.关闭流：
        fw.close();
    }
}
