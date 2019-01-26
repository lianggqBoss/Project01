package com.atguigu;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Bean {

    public static final String FILE_NAME = "filename";
    private int age;

    public static  void  main(String [] args) {
        List list = getAList();
        list.add(0, new Date());
        method1();
    }

    public static List getAList() {
        System.out.println("Bean...");
        System.out.println("Bean...");
        ArrayList list = new ArrayList();
        Date date = new Date();
        System.out.println(date);
        return list;
    }

    public static void method1() {
        //region Description
        System.out.println("method...");
        System.out.println("yes...");
        //endregion
    }

    public void test() {
        int age = 10;
        System.out.println("test...");
        try {
            FileOutputStream fis = new FileOutputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
