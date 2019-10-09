package com.company.day01.example09;

import java.util.Scanner;

public class TimSoLonNhatNhoNhat {
    static float a;
    static float b;
    static float c;
    static float d;

    static Scanner scanner = new Scanner(System.in);

    public void nhap(){
        System.out.println("Nhap vao so dau tien: ");
        a= scanner.nextFloat();
        System.out.println("Nhap vao so thu 2: ");
        b= scanner.nextFloat();
        System.out.println("Nhap vao so thu 3: ");
        c= scanner.nextFloat();
        System.out.println("Nhap vao so thu 4: ");
        d= scanner.nextFloat();
    }
    static float soLonNhat(){
        float max;
        max= a>b?a:b;
        max =c>max?c:max;
        max = d>max?d:max;
        return max;
    }
    static float soNhoNhat(){
        float min;
        min= a<b?a:b;
        min =c<min?c:min;
        min = d<min?d:min;
        return min;
    }
    public void hienThi(){
        System.out.println("So lon nhat la: "+soNhoNhat());
        System.out.println("So nho nhat la: "+soNhoNhat());
    }
}
