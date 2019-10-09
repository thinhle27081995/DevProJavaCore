package com.company.day01.example01;

import java.util.Scanner;

public class ToanHoc {
    static Scanner scanner = new Scanner(System.in);

    static double goc;

    public void nhap(){
        System.out.println("=== Tinh Sin Cos ====");
        System.out.println("Nhap vao goc can tinh: ");
        goc = scanner.nextInt();
    }
    static double chuyenDoiRadian(){
        return Math.toRadians(goc);
    }
    static double tinhSin(){
        return Math.sin(chuyenDoiRadian());
    }
    static double tinhCos(){
        return Math.cos(chuyenDoiRadian());
    }
    public void hienThi(){
        System.out.println("==== Ket Qua =====");
        System.out.println("Sin "+goc+" = "+ tinhSin());
        System.out.println("Cos "+goc+" = "+ tinhCos());
    }
}
