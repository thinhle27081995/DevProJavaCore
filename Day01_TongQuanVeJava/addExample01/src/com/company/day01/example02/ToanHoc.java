package com.company.day01.example02;

import java.util.Scanner;

public class ToanHoc {
    static float x;
    static float y;
    static int n;
    static Scanner scanner = new Scanner(System.in);
    public void nhap(){
        System.out.println("Nhap vao so thuc x: ");
        x = scanner.nextFloat();
        System.out.println("Nhap vao so thuc y: ");
        y = scanner.nextFloat();
        System.out.println("Nhap vao so nguyen n: ");
        n = scanner.nextInt();
    }
    static double tinhGiaTri(){
        return Math.sqrt(Math.pow(x,5)+Math.exp(Math.log(Math.abs(y))))*((1+Math.sin(x))/((Math.cos(n*x))+2));
    }
    public void hienThi(){
        System.out.println("Gia tri bieu thuc la: "+ tinhGiaTri());
    }
}
