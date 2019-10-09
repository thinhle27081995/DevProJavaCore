package com.company.day02.exercise01;

import java.util.Scanner;

public class CanBo {
    //Xay dung bien
    static String maCanBo;
    static String hoTen;
    static String ngaySinh;
    static int soNgayLamViec;

    static Scanner scanner = new Scanner(System.in);

    //Xay dung ham nhap
    static void nhapCanBo(){
        System.out.print("Nhap vao ma can bo: ");
        maCanBo = scanner.nextLine();
        System.out.print("Nhap vao ten can bo: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhap vap ngay sinh can bo: ");
        ngaySinh = scanner.nextLine();
        System.out.print("Nhap vap so ngay lam viec trong thang: ");
        soNgayLamViec =scanner.nextInt();
        scanner.nextLine();
    }
    //Xay dung ham xuat can bo
    static void xuatCanBo(){
        System.out.println("Ma can bo: "+maCanBo);
        System.out.println("Ten can bo: "+hoTen);
        System.out.println("Ngay sinh can bo: "+ngaySinh);
        System.out.println("So ngay lam viec trong thang: "+soNgayLamViec);
        System.out.format("Luong cua can bo "+hoTen+" la: %,10d vnd\n",
                tinhLuong());
    }
    //Xay dung phuong thuc tinh luong
    static long tinhLuong(){
        return soNgayLamViec*450000;
    }
}
