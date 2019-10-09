package com.company.day01.example10;

import java.util.Scanner;

public class DiaChi {
    private String soNha;
    private String toDanPho;
    private String phuong;
    private String quan;
    private String thanhPho;
    private Scanner scanner = new Scanner(System.in);
    public void nhap(){
        System.out.println("Nhap so nha: ");
        soNha = scanner.nextLine();
        System.out.println("Nhap to dan pho: ");
        toDanPho = scanner.nextLine();
        System.out.println("Nhap phuong: ");
        phuong = scanner.nextLine();
        System.out.println("Nhap quan: ");
        quan = scanner.nextLine();
        System.out.println("Nhap thanh pho: ");
        thanhPho = scanner.nextLine();
    }
    public void hienThi(){
        System.out.println("So nha: "+soNha);
        System.out.println("To Dan Pho: "+toDanPho);
        System.out.println("Phuong: "+phuong);
        System.out.println("Quan: "+quan);
        System.out.println("Thanh Pho: "+thanhPho);
    }
}
