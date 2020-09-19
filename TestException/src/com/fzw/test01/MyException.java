package com.fzw.test01;

/**
 * @Auther: fzw
 * @Date: 2020/9/19 - 09 - 19 - 23:51
 * @Description: com.fzw.test01
 * @version: 1.0 可以自定义自己的异常
 * 自定义运行时异常(RunTimeException):如果继承的是运行时异常，那么在使用的时候无需额外处理
 * 自定义检查异常(Exception):如果继承的是检查异常，那么使用的时候需要try-catch捕获或者throws向上抛
 */
public class MyException extends RuntimeException{
    static final long serialVersionUID = -70348971907L;

    //空构造函数
    public MyException(){
    }
    //带一个字符串的构造函数，可以返回具体的异常描述
    public MyException(String msg){
        super(msg);
    }
}
