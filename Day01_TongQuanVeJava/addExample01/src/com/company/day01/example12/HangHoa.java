package com.company.day01.example12;

public class HangHoa {
    String tenHangHoa1;
    String tenHangHoa2;
    String tenHangHoa3;
    String tenHangHoa4;
    String tenHangHoa5;

    int soLuong1;
    int soLuong2;
    int soLuong3;
    int soLuong4;
    int soLuong5;

    int donGia1;
    int donGia2;
    int donGia3;
    int donGia4;
    int donGia5;
    public float thanhTienLoaiHang1(){
        return soLuong1*donGia1;
    }
    public float thanhTienLoaiHang2(){
        return soLuong2*donGia2;
    }
    public float thanhTienLoaiHang3(){
        return soLuong3*donGia1;
    }
    public float thanhTienLoaiHang4(){
        return soLuong4*donGia4;
    }
    public float thanhTienLoaiHang5(){
        return soLuong5*donGia5;
    }
    public void hienThi(){
        System.out.println("Hang 1: "+tenHangHoa1);
        System.out.println("Hang 2: "+tenHangHoa2);
        System.out.println("Hang 3: "+tenHangHoa3);
        System.out.println("Hang 4: "+tenHangHoa4);
        System.out.println("Hang 5: "+tenHangHoa5);
        System.out.println("So luong 1: "+soLuong1);
        System.out.println("So luong 2: "+soLuong2);
        System.out.println("So luong 3: "+soLuong4);
        System.out.println("So luong 4: "+soLuong4);
        System.out.println("So luong 5: "+soLuong5);
        System.out.println("Don gia 1: "+donGia1);
        System.out.println("Don gia 2: "+donGia2);
        System.out.println("Don gia 3: "+donGia3);
        System.out.println("Don gia 4: "+donGia4);
        System.out.println("Don gia 5: "+donGia5);
    }



}
