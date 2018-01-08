package com.wjl.algorithms.chapter1_1;

import java.util.Scanner;

/**
 * Created by wjl on 2018/1/8.
 */
public class EX_1_1_3 {

    public static void main(String[] args) {


        System.out.println("请输入三个数字, 输入一个按一次回车:");
        Scanner scanner1 = new Scanner(System.in);
        String s1 = scanner1.next();
        Scanner scanner2 = new Scanner(System.in);
        String s2 = scanner2.next();
        Scanner scanner3 = new Scanner(System.in);
        String s3 = scanner3.next();

        if (s1.equals(s2) && s1.equals(s3) && s2.equals(s3)) {
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }

    }
}
