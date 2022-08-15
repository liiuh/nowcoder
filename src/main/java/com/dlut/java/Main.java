package com.dlut.java;

import java.util.Scanner;

/**
 * @author LiuHeng
 * @create 2022-08-11 21:59
 */
public class Main {
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while(in.hasNextLine()){
//            int n = in.nextInt();
//            int m = in.nextInt();
//            double ans = n;
//            double n_f = n;
//            for(int i = 1; i < m; i++){
//                n_f = Math.sqrt(n_f);
//                ans += n_f;
//            }
//            System.out.println(ans);
//        }
//    }

    public static void main(String args[]){
        String s = " [7,8,9]]".replace("],", "");
        System.out.println(s);
        s = s.replace(" ", "");
        System.out.println(s);
        s  = s.replace("[", "");
        System.out.println(s);
        s = s.replace("]", "");
        System.out.println(s);


    }
}
