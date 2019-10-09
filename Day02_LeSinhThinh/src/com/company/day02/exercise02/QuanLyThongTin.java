package com.company.day02.exercise02;

import java.util.Scanner;

public class QuanLyThongTin {
    static Scanner scanner = new Scanner(System.in);

//    private float diemTBHS1;
//    private float diemTBHS2;
//    private float diemTBHS3;
//    private float diemTBHS4;
//    private float diemTBHS5;
//
//    public float getDiemTBHS1() {
//        return diemTBHS1;
//    }
//
//    public void setDiemTBHS1(float diemTBHS1) {
//        this.diemTBHS1 = diemTBHS1;
//    }
//
//    public float getDiemTBHS2() {
//        return diemTBHS2;
//    }
//
//    public void setDiemTBHS2(float diemTBHS2) {
//        this.diemTBHS2 = diemTBHS2;
//    }
//
//    public float getDiemTBHS3() {
//        return diemTBHS3;
//    }
//
//    public void setDiemTBHS3(float diemTBHS3) {
//        this.diemTBHS3 = diemTBHS3;
//    }
//
//    public float getDiemTBHS4() {
//        return diemTBHS4;
//    }
//
//    public void setDiemTBHS4(float diemTBHS4) {
//        this.diemTBHS4 = diemTBHS4;
//    }
//
//    public float getDiemTBHS5() {
//        return diemTBHS5;
//    }
//
//    public void setDiemTBHS5(float diemTBHS5) {
//        this.diemTBHS5 = diemTBHS5;
//    }

    static void nhapMon1(HocSinh hocSinh,MonHoc monHoc){
        System.out.println("Nhap vao ten hoc sinh: ");
        hocSinh.setHoTen1(scanner.nextLine());
        System.out.println("Nhap vao tuoi hoc sinh: ");
        hocSinh.setTuoi1(scanner.nextByte());
        scanner.nextLine();
        System.out.println("Nhap vao gioi tinh: ");
        hocSinh.setGioiTinh1(scanner.nextLine());
        System.out.print("Nhap vao ten mon hoc 1 ");
        monHoc.setTenMonHoc1(scanner.nextLine());
        System.out.print("Nhap vao he so mon hoc 1 ");
        monHoc.setHeSo1(scanner.nextFloat());
        System.out.print("Nhap vao diem mon hoc 1 ");
        monHoc.setDiemMonHoc1(scanner.nextFloat());
        scanner.nextLine();
        System.out.print("Nhap vao ten mon hoc 2 ");
        monHoc.setTenMonHoc2(scanner.nextLine());
        System.out.print("Nhap vao he so mon hoc 2 ");
        monHoc.setHeSo2(scanner.nextFloat());
        System.out.print("Nhap vao diem mon hoc 2 ");
        monHoc.setDiemMonHoc2(scanner.nextFloat());
        scanner.nextLine();
        System.out.print("Nhap vao ten mon hoc 3 ");
        monHoc.setTenMonHoc3(scanner.nextLine());
        System.out.print("Nhap vao he so mon hoc 3 ");
        monHoc.setHeSo3(scanner.nextFloat());
        System.out.print("Nhap vao diem mon hoc 3 ");
        monHoc.setDiemMonHoc3(scanner.nextFloat());
        scanner.nextLine();
    }
    static void nhapMon2(HocSinh hocSinh,MonHoc monHoc){
        System.out.println("Nhap vao ten hoc sinh: ");
        hocSinh.setHoTen2(scanner.nextLine());
        System.out.println("Nhap vao tuoi hoc sinh: ");
        hocSinh.setTuoi2(scanner.nextByte());
        scanner.nextLine();
        System.out.println("Nhap vao gioi tinh: ");
        hocSinh.setGioiTinh2(scanner.nextLine());
        System.out.print("Nhap vao ten mon hoc 1 ");
        monHoc.setTenMonHoc1(scanner.nextLine());
        System.out.print("Nhap vao he so mon hoc 1 ");
        monHoc.setHeSo1(scanner.nextFloat());
        System.out.print("Nhap vao diem mon hoc 1 ");
        monHoc.setDiemMonHoc1(scanner.nextFloat());
        scanner.nextLine();
        System.out.print("Nhap vao ten mon hoc 2 ");
        monHoc.setTenMonHoc2(scanner.nextLine());
        System.out.print("Nhap vao he so mon hoc 2 ");
        monHoc.setHeSo2(scanner.nextFloat());
        System.out.print("Nhap vao diem mon hoc 2 ");
        monHoc.setDiemMonHoc2(scanner.nextFloat());
        scanner.nextLine();
        System.out.print("Nhap vao ten mon hoc 3 ");
        monHoc.setTenMonHoc3(scanner.nextLine());
        System.out.print("Nhap vao he so mon hoc 3 ");
        monHoc.setHeSo3(scanner.nextFloat());
        System.out.print("Nhap vao diem mon hoc 3 ");
        monHoc.setDiemMonHoc3(scanner.nextFloat());
        scanner.nextLine();
    }
    static void nhapMon3(HocSinh hocSinh,MonHoc monHoc){
        System.out.println("Nhap vao ten hoc sinh: ");
        hocSinh.setHoTen3(scanner.nextLine());
        System.out.println("Nhap vao tuoi hoc sinh: ");
        hocSinh.setTuoi3(scanner.nextByte());
        scanner.nextLine();
        System.out.println("Nhap vao gioi tinh: ");
        hocSinh.setGioiTinh3(scanner.nextLine());
        System.out.print("Nhap vao ten mon hoc 1 ");
        monHoc.setTenMonHoc1(scanner.nextLine());
        System.out.print("Nhap vao he so mon hoc 1 ");
        monHoc.setHeSo1(scanner.nextFloat());
        System.out.print("Nhap vao diem mon hoc 1 ");
        monHoc.setDiemMonHoc1(scanner.nextFloat());
        scanner.nextLine();
        System.out.print("Nhap vao ten mon hoc 2 ");
        monHoc.setTenMonHoc2(scanner.nextLine());
        System.out.print("Nhap vao he so mon hoc 2 ");
        monHoc.setHeSo2(scanner.nextFloat());
        System.out.print("Nhap vao diem mon hoc 2 ");
        monHoc.setDiemMonHoc2(scanner.nextFloat());
        scanner.nextLine();
        System.out.print("Nhap vao ten mon hoc 3 ");
        monHoc.setTenMonHoc3(scanner.nextLine());
        System.out.print("Nhap vao he so mon hoc 3 ");
        monHoc.setHeSo3(scanner.nextFloat());
        System.out.print("Nhap vao diem mon hoc 3 ");
        monHoc.setDiemMonHoc3(scanner.nextFloat());
        scanner.nextLine();
    }
    static void nhapMon4(HocSinh hocSinh,MonHoc monHoc){
        System.out.println("Nhap vao ten hoc sinh: ");
        hocSinh.setHoTen4(scanner.nextLine());
        System.out.println("Nhap vao tuoi hoc sinh: ");
        hocSinh.setTuoi4(scanner.nextByte());
        scanner.nextLine();
        System.out.println("Nhap vao gioi tinh: ");
        hocSinh.setGioiTinh4(scanner.nextLine());
        System.out.print("Nhap vao ten mon hoc 1 ");
        monHoc.setTenMonHoc1(scanner.nextLine());
        System.out.print("Nhap vao he so mon hoc 1 ");
        monHoc.setHeSo1(scanner.nextFloat());
        System.out.print("Nhap vao diem mon hoc 1 ");
        monHoc.setDiemMonHoc1(scanner.nextFloat());
        scanner.nextLine();
        System.out.print("Nhap vao ten mon hoc 2 ");
        monHoc.setTenMonHoc2(scanner.nextLine());
        System.out.print("Nhap vao he so mon hoc 2 ");
        monHoc.setHeSo2(scanner.nextFloat());
        System.out.print("Nhap vao diem mon hoc 2 ");
        monHoc.setDiemMonHoc2(scanner.nextFloat());
        scanner.nextLine();
        System.out.print("Nhap vao ten mon hoc 3 ");
        monHoc.setTenMonHoc3(scanner.nextLine());
        System.out.print("Nhap vao he so mon hoc 3 ");
        monHoc.setHeSo3(scanner.nextFloat());
        System.out.print("Nhap vao diem mon hoc 3 ");
        monHoc.setDiemMonHoc3(scanner.nextFloat());
        scanner.nextLine();
    }
    static void nhapMon5(HocSinh hocSinh,MonHoc monHoc){
        System.out.println("Nhap vao ten hoc sinh: ");
        hocSinh.setHoTen5(scanner.nextLine());
        System.out.println("Nhap vao tuoi hoc sinh: ");
        hocSinh.setTuoi5(scanner.nextByte());
        scanner.nextLine();
        System.out.println("Nhap vao gioi tinh: ");
        hocSinh.setGioiTinh5(scanner.nextLine());
        System.out.print("Nhap vao ten mon hoc 1 ");
        monHoc.setTenMonHoc1(scanner.nextLine());
        System.out.print("Nhap vao he so mon hoc 1 ");
        monHoc.setHeSo1(scanner.nextFloat());
        System.out.print("Nhap vao diem mon hoc 1 ");
        monHoc.setDiemMonHoc1(scanner.nextFloat());
        scanner.nextLine();
        System.out.print("Nhap vao ten mon hoc 2 ");
        monHoc.setTenMonHoc2(scanner.nextLine());
        System.out.print("Nhap vao he so mon hoc 2 ");
        monHoc.setHeSo2(scanner.nextFloat());
        System.out.print("Nhap vao diem mon hoc 2 ");
        monHoc.setDiemMonHoc2(scanner.nextFloat());
        scanner.nextLine();
        System.out.print("Nhap vao ten mon hoc 3 ");
        monHoc.setTenMonHoc3(scanner.nextLine());
        System.out.print("Nhap vao he so mon hoc 3 ");
        monHoc.setHeSo3(scanner.nextFloat());
        System.out.print("Nhap vao diem mon hoc 3 ");
        monHoc.setDiemMonHoc3(scanner.nextFloat());
    }
    static void xuat1(HocSinh hocSinh,MonHoc monHoc){
        System.out.println("Ten hoc 1 "+hocSinh.getHoTen1());
        System.out.println("Tuoi 1 "+hocSinh.getTuoi1());
        System.out.println("Gioi tinh 1 "+hocSinh.getGioiTinh1());
        System.out.println("Mon hoc 1 "+monHoc.getTenMonHoc1());
        System.out.println("He so 1 "+monHoc.getHeSo1());
        System.out.println("Diem mon 1 "+monHoc.getDiemMonHoc1());
        System.out.println("Mon hoc 2 "+monHoc.getTenMonHoc2());
        System.out.println("He so 2 "+monHoc.getHeSo2());
        System.out.println("Diem mon 2 "+monHoc.getDiemMonHoc2());
        System.out.println("Mon hoc 3 "+monHoc.getTenMonHoc3());
        System.out.println("He so 3 "+monHoc.getHeSo3());
        System.out.println("Diem mon 3 "+monHoc.getDiemMonHoc3());
    }
    static void xuat2(HocSinh hocSinh,MonHoc monHoc){
        System.out.println("Ten hoc 2 "+hocSinh.getHoTen2());
        System.out.println("Tuoi 2 "+hocSinh.getTuoi2());
        System.out.println("Gioi tinh 2 "+hocSinh.getGioiTinh2());
        System.out.println("Mon hoc 1 "+monHoc.getTenMonHoc1());
        System.out.println("He so 1 "+monHoc.getHeSo1());
        System.out.println("Diem mon 1 "+monHoc.getDiemMonHoc1());
        System.out.println("Mon hoc 2 "+monHoc.getTenMonHoc2());
        System.out.println("He so 2 "+monHoc.getHeSo2());
        System.out.println("Diem mon 2 "+monHoc.getDiemMonHoc2());
        System.out.println("Mon hoc 3 "+monHoc.getTenMonHoc3());
        System.out.println("He so 3 "+monHoc.getHeSo3());
        System.out.println("Diem mon 3 "+monHoc.getDiemMonHoc3());
    }
    static void xuat3(HocSinh hocSinh,MonHoc monHoc){
        System.out.println("Ten hoc 3 "+hocSinh.getHoTen3());
        System.out.println("Tuoi 3 "+hocSinh.getTuoi3());
        System.out.println("Gioi tinh 3 "+hocSinh.getGioiTinh3());
        System.out.println("Mon hoc 1 "+monHoc.getTenMonHoc1());
        System.out.println("He so 1 "+monHoc.getHeSo1());
        System.out.println("Diem mon 1 "+monHoc.getDiemMonHoc1());
        System.out.println("Mon hoc 2 "+monHoc.getTenMonHoc2());
        System.out.println("He so 2 "+monHoc.getHeSo2());
        System.out.println("Diem mon 2 "+monHoc.getDiemMonHoc2());
        System.out.println("Mon hoc 3 "+monHoc.getTenMonHoc3());
        System.out.println("He so 3 "+monHoc.getHeSo3());
        System.out.println("Diem mon 3 "+monHoc.getDiemMonHoc3());
    }
    static void xuat4(HocSinh hocSinh,MonHoc monHoc){
        System.out.println("Ten hoc 4 "+hocSinh.getHoTen4());
        System.out.println("Tuoi 4 "+hocSinh.getTuoi4());
        System.out.println("Gioi tinh 4 "+hocSinh.getGioiTinh4());
        System.out.println("Mon hoc 1 "+monHoc.getTenMonHoc1());
        System.out.println("He so 1 "+monHoc.getHeSo1());
        System.out.println("Diem mon 1 "+monHoc.getDiemMonHoc1());
        System.out.println("Mon hoc 2 "+monHoc.getTenMonHoc2());
        System.out.println("He so 2 "+monHoc.getHeSo2());
        System.out.println("Diem mon 2 "+monHoc.getDiemMonHoc2());
        System.out.println("Mon hoc 3 "+monHoc.getTenMonHoc3());
        System.out.println("He so 3 "+monHoc.getHeSo3());
        System.out.println("Diem mon 3 "+monHoc.getDiemMonHoc3());
    }
    static void xuat5(HocSinh hocSinh,MonHoc monHoc){
        System.out.println("Ten hoc 5 "+hocSinh.getHoTen5());
        System.out.println("Tuoi 5 "+hocSinh.getTuoi5());
        System.out.println("Gioi tinh 5 "+hocSinh.getGioiTinh5());
        System.out.println("Mon hoc 1 "+monHoc.getTenMonHoc1());
        System.out.println("He so 1 "+monHoc.getHeSo1());
        System.out.println("Diem mon 1 "+monHoc.getDiemMonHoc1());
        System.out.println("Mon hoc 2 "+monHoc.getTenMonHoc2());
        System.out.println("He so 2 "+monHoc.getHeSo2());
        System.out.println("Diem mon 2 "+monHoc.getDiemMonHoc2());
        System.out.println("Mon hoc 3 "+monHoc.getTenMonHoc3());
        System.out.println("He so 3 "+monHoc.getHeSo3());
        System.out.println("Diem mon 3 "+monHoc.getDiemMonHoc3());
    }
    static float diemTB1(MonHoc monHoc){
        float tb = (monHoc.getHeSo1()*monHoc.getDiemMonHoc1()+
                monHoc.getHeSo2()*monHoc.getDiemMonHoc2()+
                monHoc.getHeSo3()*monHoc.getDiemMonHoc3())/
                (monHoc.getHeSo3()+monHoc.getHeSo1()+monHoc.getHeSo2());
        return tb;
    }
    static float diemTB2(MonHoc monHoc){
        float tb = (monHoc.getHeSo1()*monHoc.getDiemMonHoc1()+
                monHoc.getHeSo2()*monHoc.getDiemMonHoc2()+
                monHoc.getHeSo3()*monHoc.getDiemMonHoc3())/
                (monHoc.getHeSo3()+monHoc.getHeSo1()+monHoc.getHeSo2());
        return tb;
    }
    static float diemTB3(MonHoc monHoc){
        float tb = (monHoc.getHeSo1()*monHoc.getDiemMonHoc1()+
                monHoc.getHeSo2()*monHoc.getDiemMonHoc2()+
                monHoc.getHeSo3()*monHoc.getDiemMonHoc3())/
                (monHoc.getHeSo3()+monHoc.getHeSo1()+monHoc.getHeSo2());
        return tb;
    }
    static float diemTB4(MonHoc monHoc){
        float tb = (monHoc.getHeSo1()*monHoc.getDiemMonHoc1()+
                monHoc.getHeSo2()*monHoc.getDiemMonHoc2()+
                monHoc.getHeSo3()*monHoc.getDiemMonHoc3())/
                (monHoc.getHeSo3()+monHoc.getHeSo1()+monHoc.getHeSo2());
        return tb;
    }
    static float diemTB5(MonHoc monHoc){
        float tb = (monHoc.getHeSo1()*monHoc.getDiemMonHoc1()+
                monHoc.getHeSo2()*monHoc.getDiemMonHoc2()+
                monHoc.getHeSo3()*monHoc.getDiemMonHoc3())/
                (monHoc.getHeSo3()+monHoc.getHeSo1()+monHoc.getHeSo2());
        return tb;
    }

}
