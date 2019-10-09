package com.company.day01.example12;

import java.util.Scanner;

public class Dates {
    private int day;
    private int month;
    private int year;
    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("\tDay: ");
        day = in.nextInt();
        System.out.print("\tMonth: ");
        month = in.nextInt();
        System.out.print("\tYear: ");
        year = in.nextInt();
    }
    public void display() {
        System.out.println(day + "/" + month + "/" + year);
    }
}
