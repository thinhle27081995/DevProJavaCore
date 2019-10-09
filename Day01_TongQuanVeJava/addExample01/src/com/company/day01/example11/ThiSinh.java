package com.company.day01.example11;

import java.util.Scanner;

public class ThiSinh {
    private String soBaoDanh;
    private String hoDem;
    private String ten;
    private Dates dates = new Dates();
    private MonThi monThi = new MonThi();
    private float diemThi1;
    private float diemThi2;
    private float diemThi3;
    private Scanner scanner = new Scanner(System.in);
    public void nhapThiSinh(){
        System.out.println("Nhap vao so bao danh: ");
        soBaoDanh =scanner.nextLine();
        System.out.println("Nhap vao ho dem: ");
        hoDem =scanner.nextLine();
        System.out.println("Nhap vao ten: ");
        ten =scanner.nextLine();
        System.out.println("Nhap vao ngay sinh: ");
        dates.input();
    }
    public void nhapMonThiThuNhat(){
        System.out.println("=== Nhap mon thu thu nhat ====");
        System.out.println("Nhap ma mon thi 1: ");
        monThi.maMonThi1 =scanner.nextLine();
        System.out.println("Nhap ten mon thi 1: ");
        monThi.tenMonThi1 =scanner.nextLine();
        System.out.println("Nhap vao diem mon thu nhat: ");
        diemThi1 = scanner.nextFloat();
        System.out.println("Nhap vao he so diem 1: ");
        monThi.heSoDiem1 = scanner.nextFloat();
    }
    public void nhapMonThiThuHai(){
        scanner.nextLine();
        System.out.println("=== Nhap mon thu thu hai ====");
        System.out.println("Nhap ma mon thi 2: ");
        monThi.maMonThi2 =scanner.nextLine();
        System.out.println("Nhap ten mon thi 2: ");
        monThi.tenMonThi2 =scanner.nextLine();
        System.out.println("Nhap vao diem mon thu 2: ");
        diemThi2= scanner.nextFloat();
        System.out.println("Nhap vao he so diem 2: ");
        monThi.heSoDiem2 = scanner.nextFloat();
    }
    public void nhapMonThiThuBa(){
        scanner.nextLine();
        System.out.println("=== Nhap mon thu thu ba ====");
        System.out.println("Nhap ma mon thi 3: ");
        monThi.maMonThi3 =scanner.nextLine();
        System.out.println("Nhap ten mon thi 3: ");
        monThi.tenMonThi3 =scanner.nextLine();
        System.out.println("Nhap vao diem mon thu 3: ");
        diemThi3 = scanner.nextFloat();
        System.out.println("Nhap vao he so diem 3: ");
        monThi.heSoDiem3 = scanner.nextFloat();
    }

    public float tongDiem(){
        return (monThi.heSoDiem1*diemThi1+monThi.heSoDiem2*diemThi2+monThi.heSoDiem3*diemThi3);
    }
    public void hienThi(){
        System.out.println("So Bao Danh: "+soBaoDanh);
        System.out.println("Ho dem: "+hoDem);
        System.out.println("Ten: "+ten);
        System.out.println("Ngay sinh: ");
        dates.display();
        System.out.println("Hien thi mon thi: ");
        monThi.hienThi();
        System.out.println("Diem thi 1: "+diemThi1);
        System.out.println("Diem thi 2: "+diemThi2);
        System.out.println("Diem thi 3: "+diemThi3);
        System.out.println("Tong diem: "+tongDiem());
    }


}
