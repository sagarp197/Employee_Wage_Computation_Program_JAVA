package com.bridgelabz;

public class UC_4 {
    private static final int WAGE_PER_HOUR = 20;
    private static final int FULL_DAY_HOUR = 8;
    private static final int HALF_DAY_HOUR = 4;

    private static final int IS_FULL_TIME = 1;

    private static final int IS_PART_TIME = 2;

    public static void main(String[] args) {
        int dailyWage = 0;
        int empStatus = (int) (Math.random() * 10) % 3;
        System.out.println(empStatus);

        switch (empStatus) {

            case IS_FULL_TIME:
                System.out.println("Employee worked FULL TIME");
                //workingHours = workingHours + FULL_DAY_HOUR;
                dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                System.out.println("Employees Wage for Day is: " + dailyWage);
                break;

            case IS_PART_TIME:
                System.out.println("Employee worked PART_TIME");
                //workingHours = workingHours + HALF_DAY_HOUR;
                dailyWage = WAGE_PER_HOUR * HALF_DAY_HOUR;
                System.out.println("Employees Wage for Day is: " + dailyWage);
                break;

            default:
                System.out.println("Employee is Absent");
        }
    }
}
