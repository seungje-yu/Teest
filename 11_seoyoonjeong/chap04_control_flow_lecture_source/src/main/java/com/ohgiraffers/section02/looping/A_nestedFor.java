package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_nestedFor {

    public void printGugudanFromTwoToNine(){

        for(int dan=2; dan<10; dan++){
            printGugudanOf(dan);
            System.out.println();
        }
    }
    public void printGugudanOf(int dan){
        for(int su=1; su<10; su++){
            System.out.println(dan+" * "+" = "+( dan * su ));
        }
    }

    public void printStartInputRowTimes(){
        Scanner sc=new Scanner(System.in);
        System.out.println(" 입력할 수:");
        int row=sc.nextInt();

        for(int i=1; i<=row; i++){

            for(int j=1; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }



}

