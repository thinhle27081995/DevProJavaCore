package com.company.day02.exercise03;

import java.util.Scanner;

public class QuanLyBanHang {
    static Scanner scanner = new Scanner(System.in);

    //Khach mua hang
    static void nhapKhachHang(PhieuBanHang phieu){
        System.out.println("Nhap ma phieu: ");
        phieu.setMaPhieu(scanner.nextLine());
        System.out.println("Nhap ten khach hang: ");
        phieu.setTenKhachHang(scanner.nextLine());
        System.out.println("Nhap so dien thoai: ");
        phieu.setSoDienThoai(scanner.nextLine());
    }

    //Loai hang
    static void nhap1(LoaiHang loaiHang){
        System.out.println("Nhap ten hang: ");
        loaiHang.setTenHang1(scanner.nextLine());
        System.out.println("Nhap don vi tinh: ");
        loaiHang.setDonViTinh1(scanner.nextLine());
        System.out.println("Nhap so luong: ");
        loaiHang.setSoLuong1(scanner.nextByte());
        System.out.println("Nhap don gia: ");
        loaiHang.setDonGia1(scanner.nextInt());
        scanner.nextLine();
    }
    static void nhap2(LoaiHang loaiHang){
        System.out.println("Nhap ten hang: ");
        loaiHang.setTenHang2(scanner.nextLine());
        System.out.println("Nhap don vi tinh: ");
        loaiHang.setDonViTinh2(scanner.nextLine());
        System.out.println("Nhap so luong: ");
        loaiHang.setSoLuong2(scanner.nextByte());
        System.out.println("Nhap don gia: ");
        loaiHang.setDonGia2(scanner.nextInt());
        scanner.nextLine();
    }
    static void nhap3(LoaiHang loaiHang){
        System.out.println("Nhap ten hang: ");
        loaiHang.setTenHang3(scanner.nextLine());
        System.out.println("Nhap don vi tinh: ");
        loaiHang.setDonViTinh3(scanner.nextLine());
        System.out.println("Nhap so luong: ");
        loaiHang.setSoLuong3(scanner.nextByte());
        System.out.println("Nhap don gia: ");
        loaiHang.setDonGia3(scanner.nextInt());
        scanner.nextLine();
    }
    static void nhap4(LoaiHang loaiHang){
        System.out.println("Nhap ten hang: ");
        loaiHang.setTenHang4(scanner.nextLine());
        System.out.println("Nhap don vi tinh: ");
        loaiHang.setDonViTinh4(scanner.nextLine());
        System.out.println("Nhap so luong: ");
        loaiHang.setSoLuong4(scanner.nextByte());
        System.out.println("Nhap don gia: ");
        loaiHang.setDonGia4(scanner.nextInt());
        scanner.nextLine();
    }
    static void nhap5(LoaiHang loaiHang){
        System.out.println("Nhap ten hang: ");
        loaiHang.setTenHang5(scanner.nextLine());
        System.out.println("Nhap don vi tinh: ");
        loaiHang.setDonViTinh5(scanner.nextLine());
        System.out.println("Nhap so luong: ");
        loaiHang.setSoLuong5(scanner.nextByte());
        System.out.println("Nhap don gia: ");
        loaiHang.setDonGia5(scanner.nextInt());
        //scanner.nextLine();
    }

    static int thanhTien1(LoaiHang loaiHang){
        return loaiHang.getSoLuong1()*loaiHang.getDonGia1();
    }
    static int thanhTien2(LoaiHang loaiHang){
        return loaiHang.getSoLuong2()*loaiHang.getDonGia2();
    }
    static int thanhTien3(LoaiHang loaiHang){
        return loaiHang.getSoLuong3()*loaiHang.getDonGia3();
    }
    static int thanhTien4(LoaiHang loaiHang){
        return loaiHang.getSoLuong4()*loaiHang.getDonGia4();
    }
    static int thanhTien5(LoaiHang loaiHang){
        return loaiHang.getSoLuong5()*loaiHang.getDonGia5();
    }
}
