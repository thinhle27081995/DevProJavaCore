package com.company.day01.example07;


import java.util.Scanner;

public class MatPhang {
    static int x1;
    static int y1;
    static int x2;
    static int y2;
    static Scanner scanner = new Scanner(System.in);

    public void nhap(){
        System.out.println("Nhap vao toa do dinh A: ");
        System.out.println("x1 = ");
        x1 = scanner.nextInt();
        System.out.println("y1 = ");
        y1 = scanner.nextInt();
        System.out.println("Nhap vao toa do dinh B: ");
        System.out.println("x2 = ");
        x2 = scanner.nextInt();
        System.out.println("y2 = ");
        y2 = scanner.nextInt();
    }
    static double tinhKhoangCach(){
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }
    public void hienThi(){
        System.out.println("Khoang cua 2 diem A("+x1+","+y1+") va B("+x2+","+y2+") = "+tinhKhoangCach());
    }
}
