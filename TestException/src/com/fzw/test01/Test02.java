package com.fzw.test01;

import java.util.Scanner;

/**
 * @Auther: fzw
 * @Date: 2020/9/19 - 09 - 19 - 23:14
 * @Description: com.fzw.test01
 * @version: 1.0 用try-catch-finally捕获异常
 */
public class Test02 {
    //这是main方法,程序的入口:
    public static void main(String[] args) {
        //实现一个功能：键盘录入两个数，求商：
        try{
            Scanner input = new Scanner(System.in);
            System.out.println("请输入第一个数:");
            int num1 = input.nextInt();
            System.out.println("请输入第二个数:");
            int num2 = input.nextInt();
            System.out.println("商:" + num1 / num2);
        }catch(Exception ex){
            /*第一种处理：什么都不写，什么都不做

            第二种处理：输出自定义异常信息
            System.out.println("对不起，您的代码有问题");

            第三种处理：打印异常信息：
            (1)调用toString方法，显示异常的类名
            System.out.println(ex.toString());
            (2)显示异常描述信息对应的字符串，如果没有就显示null
            ex.getMessage();
            (3)显示异常的堆栈信息：将异常信息捕获以后，在控制台将异常的效果给我们展示出来，方便我们查看异常
            ex.printStackTrace();

            第四种处理：抛出异常(捕获了又抛一遍)
            throw ex;
            */
           ex.printStackTrace();
           //finally中的代码一定执行，return也不能阻止，只有一种方法:System.exit(0)终止当前的虚拟机执行
        }finally{
            System.out.println("后续代码接着执行");
        }

    }
}
