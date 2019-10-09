package com.company.day01.example10;

import java.util.Scanner;

public class CongDan {
    private int soCMND;
    private String hoTen;
    private int namSinh;
    private String gioiTinh;
    private DiaChi diaChi=new DiaChi();
    private String soDienThoai;
    private Scanner scanner = new Scanner(System.in);

    public void nhap(){
        System.out.println("Nhap so CMND: ");
        soCMND=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap ho ten: ");
        hoTen =scanner.nextLine();
        System.out.println("Nhap nam sinh: ");
        namSinh = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap gioi tinh: ");
        gioiTinh = scanner.nextLine();
        //scanner.nextLine();
        System.out.println("==Nhap dia chi===");
        diaChi.nhap();
        System.out.println("Nhap so dien thoai: ");
        soDienThoai = scanner.nextLine();
    }
    public void hienThi(){
        System.out.println("So CMND: "+soCMND);
        System.out.println("Ho Ten: "+hoTen);
        System.out.println("Nam Sinh: "+namSinh);
        System.out.println("Gioi tinh: "+gioiTinh);
        diaChi.hienThi();
        System.out.println("So dien thoai: "+soDienThoai);
    }
}
