package com.company.day01.example08;

import java.util.Scanner;

public class TamGiac {
    static int x1;
    static int y1;
    static int x2;
    static int y2;
    static int x3;
    static int y3;
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
        System.out.println("Nhap vao toa do dinh C: ");
        System.out.println("x3 = ");
        x3 = scanner.nextInt();
        System.out.println("y3 = ");
        y3 = scanner.nextInt();
    }
    static double tinhKhoangCachAB(){
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }
    static double tinhKhoangCachBC(){
        return Math.sqrt(Math.pow(x3-x2,2)+Math.pow(y3-y2,2));
    }
    static double tinhKhoangCachCA(){
        return Math.sqrt(Math.pow(x1-x3,2)+Math.pow(y1-y3,2));
    }
    static double tinhCV(){
        return tinhKhoangCachAB()+tinhKhoangCachBC()+tinhKhoangCachCA();
    }
    static double dienTich(){
        double p = tinhCV()/2;
        return Math.sqrt(p*(p-tinhKhoangCachAB())*(p-tinhKhoangCachBC())*(p-tinhKhoangCachCA()));
    }
    public void hienThi(){
        System.out.println("Khoang cua 2 diem A("+x1+","+y1+") va B("+x2+","+y2+") = "+tinhKhoangCachAB());
        System.out.println("Khoang cua 2 diem B("+x2+","+y2+") va C("+x3+","+y3+") = "+tinhKhoangCachBC());
        System.out.println("Khoang cua 2 diem C("+x3+","+y3+") va A("+x1+","+y1+") = "+tinhKhoangCachCA());
        System.out.println("Chu Vi tam giac ABC = "+tinhCV());
        System.out.println("Dien Tich tam giac ABC = "+dienTich());
    }
}
