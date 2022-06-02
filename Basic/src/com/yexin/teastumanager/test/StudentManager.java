package com.yexin.teastumanager.test;


import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {

     lo: while(true){
          System.out.println("---------欢迎来到学生管理系统--------");
          System.out.println("1 添加学生");
          System.out.println("2 删除学生");
          System.out.println("3 修改学生");
          System.out.println("4 查看学生");
          System.out.println("5 退出");
          System.out.println("请输入您的选择");
          Scanner sc = new Scanner(System.in);
          String a = sc.nextLine();
//        System.out.println(a);
          switch (a)
          {
              case "1":
                  System.out.println("1 添加学生");
                  break;
              case "2":
                  System.out.println("2 删除学生");
                  break;
              case "3":
                  System.out.println("3 修改学生");
                  break;
              case "4":
                  System.out.println("4 查看学生");
                  break;
              case "5":
                  System.out.println("5 退出");
                  break lo;
              default:
                  System.out.println("您的输入不正确，请重新输入！");
          }
      }
    }
}
