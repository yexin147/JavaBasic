package com.yexin.test;

import com.yexin.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Studentmanager {
    public static void main(String[] args) {
        //1.搭建主界面菜单
        Scanner  s = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        lo:while (true){
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看学生");
            System.out.println("5 退出");
            System.out.println("请输入您的选择:");
            String choice = s.next();

            switch (choice){
                case "1":
                    addStudent(list);
                    break;
                case "2":
                    System.out.println("删除学生");
                    break;
                case "3":
                    System.out.println("修改学生");
                    break;
                case "4":
//                    System.out.println("查看学生");
                    queryStudent(list);
                    break;
                case "5":
                    System.out.println("感谢您的使用");
                    break lo;
                default:
                    System.out.println("您的输入有误");
                    break;
            }
        }

    }

    /**
     * 查看学生
     * @param list
     */
    public static void queryStudent(ArrayList<Student> list) {
        //判断集合中是否存在数据，如果存在数据，直接给出提示
        if(list.size()==0){
            System.out.println("无信息，请添加后重新查询");
            return;
        }
        //存在，展示表头数据
        System.out.println("学号\t姓名\t年龄\t生日");
        //遍历集合，获取每一个学生对象的信息，打印在控制台
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println(student.getSid()+"\t"+student.getName()+"\t"+student.getAge()+"\t"+student.getBirthday());
        }

    }

    /**
     * 添加学生
     * @param list
     */
    public static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        //1.接收学生信息
        System.out.println("请输入学号：");
        String sid = sc.next();
        System.out.println("请输入姓名：");
        String name = sc.next();
        System.out.println("请输入年龄：");
        Integer age = sc.nextInt();
        System.out.println("请输入生日：");
        String birthday = sc.next();
        //2.封装学生对象
        Student student1 = new Student(sid,name,age,birthday);
        //3，添加到集合中
        list.add(student1);
        //4.添加成功的提示信息
        System.out.println("学生添加成功");

    }
}
