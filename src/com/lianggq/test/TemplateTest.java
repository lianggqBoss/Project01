package com.lianggq.test;

import com.atguigu.entities.Student;

import java.util.ArrayList;

/**
 * @author lianggq
 * @date 2019/1/25-21:40
 */
public class TemplateTest {

    // prsf
    private static final Student STUDENT = new Student();

    public static void main(String[] args) {
        int age = 20;
        int num = 10;
        // sout
        System.out.println();
        System.out.println("TemplateTest.main");
        System.out.println("num = " + num);
        System.out.println(age);
        
        // fori
        String [] str = new String[]{"马云", "马化腾", "王健林"};
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }

        System.out.println("--------------------");

        // iter
        for (String s : str) {
            System.out.println(s);
        }

        System.out.println("--------------------");

        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        
        // list.for
        for (Object o : list) {
            
        }
        // list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }
        // list.forr
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
    }

    public void test() {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        // ifn
        if (list == null) {
            
        }
        // inn
        if (list != null) {
            
        }
        if (list == null) {

        }
        if (list != null) {

        }
    }
}
