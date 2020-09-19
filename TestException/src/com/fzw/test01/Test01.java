package com.fzw.test01;

import java.util.Scanner;

/**
 * @Auther: fzw
 * @Date: 2020/9/19 - 09 - 19 - 23:00
 * @Description: com.fzw.test01
 * @version: 1.0 用if-else堵漏洞
 * 缺点：1.代码臃肿，业务代码和处理异常的代码混在一起
 *      2.可读性差
 *      3.程序员需要花费大量的精力来维护这个漏洞
 *      4.很难堵住所有的漏洞
 */
public class Test01 {
    //这是main方法,程序的入口:
    public static void main(String[] args) {
        //实现一个功能：键盘录入两个数，求商：
        Scanner input = new Scanner(System.in);
        System.out.println("请录入第一个数:");
        if(input.hasNextInt()){
            int num1 = input.nextInt();
            System.out.println("请录入第二个数:");
            if(input.hasNextInt()){
                int num2 = input.nextInt();
                if(num2 == 0){
                    System.out.println("对不起，出书不能为0");
                }else{
                    System.out.println("商:" + num1 / num2);
                }
            }else{
                System.out.println("您输入的第二个数不是int类型的");
            }
        }else{
            System.out.println("您输入的第一个数不是int类型的");
        }
    }
}
