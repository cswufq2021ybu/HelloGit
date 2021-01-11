package com.csyi;

/**
 * @Author wufq
 * @Date 2021/1/11 16:25
 */
public class HelloGit {
    private static int sum = 0;

    public static void main(String[] args){


        System.out.println("git");
        System.out.println("更新");
        System.out.println("更新5+++++");

        for(int i=0;i<5;i++){
            sum += i;
        }

        System.out.println("sum="+sum);
    }
}
