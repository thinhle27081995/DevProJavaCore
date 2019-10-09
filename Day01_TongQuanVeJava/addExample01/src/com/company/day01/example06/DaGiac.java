package com.company.day01.example06;

import java.util.Scanner;

public class DaGiac {
    static float n;
    static float R;

    static Scanner scanner = new Scanner(System.in);

    public void nhap(){
        System.out.println("Nhap vao canh n: ");
        n= scanner.nextFloat();
        System.out.println("Nhap vao ban kinh r: ");
        R = scanner.nextFloat();
    }
    static double chuViDaGiac(){
        double a=2*R*Math.sin(Math.PI/n);
        return n*a;
    }
    static double dienTichDaGiac(){
        return (n*Math.pow(R,2))/2*Math.sin(2*Math.PI)/2;
    }
    public void hienThi(){
        System.out.println("Chu Vi Da Giac" +chuViDaGiac());
        System.out.println("Chu Vi Da Giac" +dienTichDaGiac());
    }
}
