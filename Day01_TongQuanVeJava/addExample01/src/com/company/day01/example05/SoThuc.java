package com.company.day01.example05;

import java.util.Scanner;

public class SoThuc {
    static float so1;
    static float so2;
    static float so3;
    static float so4;

    static Scanner scanner = new Scanner(System.in);

    public void nhap(){
        System.out.println("Nhap vao so thu nhat: ");
        so1 = scanner.nextFloat();
        System.out.println("Nhap vao so thu hai: ");
        so2 = scanner.nextFloat();
        System.out.println("Nhap vao so thu ba: ");
        so3 = scanner.nextFloat();
        System.out.println("Nhap vao so thu tu: ");
        so4 = scanner.nextFloat();
    }
    static float tong(){
        return so1+so2+so3+so4;
    }
    static float hieu(){
        return so1-so2-so3-so4;
    }
    static float tich(){
        return so1*so2*so3*so4;
    }
    static float thuong(){
        return so1/so2/so3/so4;
    }
    public void hienThi(){
        System.out.println("Tong ="+tong());
        System.out.println("Tich ="+tich());
        System.out.println("Hieu ="+hieu());
        System.out.println("Thuong ="+thuong());
    }
}
