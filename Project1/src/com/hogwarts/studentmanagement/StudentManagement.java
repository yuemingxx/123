package com.hogwarts.studentmanagement;

import java.util.Scanner;

public class StudentManagement {

    public void addStudent(){

        int id;
        String name;
        String sex;
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[30];
        
        for (int i=0;i<30;i++){
            Student student = new Student();
            
            System.out.println("请输入要添加的学员学号,输入后点击enter键");
            id = sc.nextInt();
            student.setId(id);

            System.out.println("请输入要添加的学员姓名,输入后点击enter键");
            name = sc.next();
            student.setName(name);

            System.out.println("请输入要添加的学员性别,输入后点击enter键");
            sex = sc.next();
            student.setSex(sex);
            
            students[i] = student;
            System.out.println("添加的学员信息：");
            for (int n = 0;n<=i;n++){
                System.out.println(students[n].toString());
            }
        }
        
    }

    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        studentManagement.addStudent();
    }
}
