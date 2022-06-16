package com.yexin.teastumanager.test;


import com.yexin.teastumanager.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student>  list = new ArrayList<>();
     lo: while(true){
          System.out.println("---------欢迎来到学生管理系统--------");
          System.out.println("1 添加学生");
          System.out.println("2 删除学生");
          System.out.println("3 修改学生");
          System.out.println("4 查看学生");
          System.out.println("5 退出");
          System.out.println("请输入您的选择");

          String a = sc.nextLine();
//        System.out.println(a);
          switch (a)
          {
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
                  System.out.println("查看学生");
                  break;//退出这一层级的循环
              case "5":
                  System.out.println("退出");
                  break lo;//退出指定的循环
              default:
                  System.out.println("您的输入不正确，请重新输入！");
          }
      }
    }

    public static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生编号：");
        String sid = sc.next ();
        System.out.println("请输入学生姓名：");
        String name = sc.next ();
        System.out.println("请输入学生年龄：");
        int age =  sc.nextInt();
        System.out.println("请输入学生生日：");
        String birth = sc.next ();
        Student stu = new Student(sid,name,age,birth);
        System.out.println("添加学生成功");
    }

}
