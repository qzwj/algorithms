package com.wjl.algorithms.chapter1_1;

/**
 * Created by wjl on 2018/1/8.
 */
public class EX_1_1_5 {

    public static void main(String[] args) {

        System.out.println(isSuitableDouble(0.4, 0.5));
        System.out.println(isSuitableDouble(1.1, 0.5));
    }

    public static boolean isSuitableDouble(double x, double y) {
        if ( (x>0 && x < 1) && (y > 0 && y < 1)){
            return true;
        }
        return false;
    }
}
