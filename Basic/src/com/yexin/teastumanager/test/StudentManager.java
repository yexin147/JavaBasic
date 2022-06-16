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
                  delStudengt(list);
                  break;
              case "3":
                  updateStudengt(list);
                  break;
              case "4":
                  queryStudent(list);
                  break;//退出这一层级的循环
              case "5":
                  System.out.println("退出");
                  break lo;//退出指定的循环
              default:
                  System.out.println("您的输入不正确，请重新输入！");
          }
      }
    }
    private static void updateStudengt(ArrayList<Student> list) {
        while(true){
            System.out.println("请输入你要修改的学生学号：");
            Scanner sc = new Scanner(System.in);
            String id = sc.next();
            int index = getIndex(list, id);
            if(index==-1){
                System.out.println("你要修改的学生信息不存在！请重新输入");
            }else{
                Student student = list.get(index);
                System.out.println("请输入新姓名：");
                String newname = sc.next();
                System.out.println("请输入新年龄：");
                int newage = sc.nextInt();
                System.out.println("请输入新生日：");
                String newbirth = sc.next();
                student.setName(newname);
                student.setAge(newage);
                student.setBirthday(newbirth);
                System.out.println("修改成功");
                break;
            }
        }
    }
    private static void delStudengt(ArrayList<Student> list) {
        while(true){
            System.out.println("请输入你要删除的学生学号：");
            Scanner sc = new Scanner(System.in);
            String id = sc.next();
            int index = getIndex(list, id);
            if(index==-1){
                System.out.println("你要删除的学生信息不存在！请重新输入");
            }else{
                list.remove(index);
                System.out.println("删除成功");
                break ;
            }
        }
    }

    private static int getIndex(ArrayList<Student>list,String id){
        int index =-1;
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            String id1 = student.getId();
            if(id1.equals(id)){
                index=i;
            }
        }
        return index;
    }
    private static void queryStudent(ArrayList<Student>list) {
        if(list.size()==0){
            System.out.println("无学生信息，请添加后查看");
            return;
        }
        System.out.println("学号\t姓名\t年龄\t生日");
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println(student.getId()+"\t"+student.getName()+"\t"+student.getAge()+"\t"+student.getBirthday());
        }
    }

    public static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        String sid;
        while(true){
            System.out.println("请输入学生编号：");
             sid = sc.next ();
            int index = getIndex(list, sid);
            if(index==-1){
                break ;
            }else{
                System.out.println("学号已经存在，请重新输入：");
            }
        }
        System.out.println("请输入学生姓名：");
        String name = sc.next ();
        System.out.println("请输入学生年龄：");
        int age =  sc.nextInt();
        System.out.println("请输入学生生日：");
        String birth = sc.next ();
        Student stu = new Student(sid,name,age,birth);
        list.add(stu);
        System.out.println("添加学生成功");
    }

}
