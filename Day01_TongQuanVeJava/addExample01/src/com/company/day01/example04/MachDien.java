package com.company.day01.example04;

import java.util.Scanner;

public class MachDien {
    static Scanner scanner = new Scanner(System.in);
    static float R;
    static float L;
    static float C;
    static float U;
    static final float W= 100*3.14f;
    public void nhap(){
        System.out.println("Nhap vao dien tro: ");
        R = scanner.nextFloat();
        System.out.println("Nhap vao do tu cam: ");
        L = scanner.nextFloat();
        System.out.println("Nhap vao dien dung : ");
        C = scanner.nextFloat();
        System.out.println("Nhap vao dien ap: ");
        U = scanner.nextFloat();
    }

    static float tinhZC(){
        return W*L;
    }
    static float tinhZL(){
        return 1/(C*W);
    }
    static double tinhZ(){
        return (double)Math.sqrt(R*R+Math.pow(tinhZL()-tinhZC(),2));
    }
    static double tinhI(){
        return (U/tinhZ());
    }
    public void hienThi(){
        System.out.println("ZC= "+tinhZC());
        System.out.println("ZL= "+tinhZL());
        System.out.println("Z= "+tinhZ());
        System.out.println("I= "+tinhI());
    }
}
