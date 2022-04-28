package com.bridgelabz;
import java.util.Scanner;
public class UC_1 {
    public static void main(String[] args){


        double x = Math.random();
        int empCheck = (int)(x *10)%2 ; // 0 or 1

        System.out.println(empCheck);

        if(empCheck == 0)
        {
            System.out.println("Employee is Absent");
        }
        else
        {
            System.out.println("Employee is Present");
        }
    }

}
