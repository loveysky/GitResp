package com.fzw.test01;

/**
 * @Auther: fzw
 * @Date: 2020/9/19 - 09 - 19 - 23:35
 * @Description: com.fzw.test01
 * @version: 1.0
 */
public class Test03 {
    //这是main方法,程序的入口:
    public static void main(String[] args) {
        //创建一个Student的对象：
        Student s = new Student();
        s.setAge(19);
        //在调用的时候在捕获，或者继续在main方法声明处用throws Exception抛给虚拟机解决
        try{
            s.setSex("sss");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    static class Student{
        private int age;
        private String sex;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) throws Exception{
            if(sex.equals("男") || sex.equals("女")){
                this.sex = sex;
            }else{
                //方法一: 制造运行时异常
                //throw new RuntimeException("性别不对");
                //方法二：制造检查异常
//                try{
//                    throw new Exception();
//                }catch(Exception e){
//                    e.printStackTrace();
//                }
                //或者只抛出异常，用throws将异常抛向调用该方法时解决
                throw new Exception();
            }
        }

        //构造方法
        public Student(int age, String sex) throws Exception{
            this.age = age;
            setSex(sex);
        }

        public Student() {

        }
    }
}
