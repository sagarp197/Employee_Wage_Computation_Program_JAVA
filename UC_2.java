package com.bridgelabz;

public class UC_2 {
    private static final int WAGE_PER_HOUR = 20;
    private static final int FULL_DAY_HOUR = 8;

    public static void main(String[] args) {

        int dailyWage = 0;

        int empStatus = (int) (Math.random() * 10) % 2;
        System.out.println(empStatus);

        if (empStatus == 1) {
            System.out.println("Employees is working full day");
            dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
            System.out.println("Employees Wage for Day is: " + dailyWage);
        } else {
            System.out.println("Employees is Absent");
        }
    }
}
