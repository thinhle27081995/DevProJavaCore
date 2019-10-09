package com.company.day01.example12;

import java.util.Scanner;

public class HoaDon {
    private String soHoaDon;
    private String tenKhachHang;
    private Dates dates = new Dates();
    private HangHoa hangHoa = new HangHoa();

    private Scanner scanner = new Scanner(System.in);

    public void nhap(){
        System.out.println("Nhap vao so hoa don: ");
        soHoaDon = scanner.nextLine();
        System.out.println("Nhap vao ten khach hang: ");
        tenKhachHang = scanner.nextLine();
        System.out.println("Ngay mua hang: ");
        dates.input();
    }
    public void nhapHang1(){
        System.out.println("Ten hang 1: ");
        hangHoa.tenHangHoa1 = scanner.nextLine();
        System.out.println("So luong 1: ");
        hangHoa.soLuong1 = scanner.nextInt();
        System.out.println("Don gia 1: ");
        hangHoa.donGia1 = scanner.nextInt();
    }
    public void nhapHang2(){
        scanner.nextLine();
        System.out.println("Ten hang 2: ");
        hangHoa.tenHangHoa2 = scanner.nextLine();
        System.out.println("So luong 2: ");
        hangHoa.soLuong2 = scanner.nextInt();
        System.out.println("Don gia 2: ");
        hangHoa.donGia2 = scanner.nextInt();
    }
    public void nhapHang3(){
        scanner.nextLine();
        System.out.println("Ten hang 3: ");
        hangHoa.tenHangHoa3 = scanner.nextLine();
        System.out.println("So luong 3: ");
        hangHoa.soLuong3 = scanner.nextInt();
        System.out.println("Don gia 3: ");
        hangHoa.donGia3 = scanner.nextInt();
    }
    public void nhapHang4(){
        scanner.nextLine();
        System.out.println("Ten hang 4: ");
        hangHoa.tenHangHoa4 = scanner.nextLine();
        System.out.println("So luong 4: ");
        hangHoa.soLuong4 = scanner.nextInt();
        System.out.println("Don gia 4: ");
        hangHoa.donGia4 = scanner.nextInt();
    }
    public void nhapHang5(){
        scanner.nextLine();
        System.out.println("Ten hang 5: ");
        hangHoa.tenHangHoa5 = scanner.nextLine();
        System.out.println("So luong 5: ");
        hangHoa.soLuong5 = scanner.nextInt();
        System.out.println("Don gia 5: ");
        hangHoa.donGia5 = scanner.nextInt();
    }
    public float tongTienHang(){
        return hangHoa.thanhTienLoaiHang1()+hangHoa.thanhTienLoaiHang2()+
                hangHoa.thanhTienLoaiHang3()+hangHoa.thanhTienLoaiHang4()+
                hangHoa.thanhTienLoaiHang5();
    }
    public float tienPhaiTra(){
        return tongTienHang()+ 0.1f*tongTienHang();
    }
    public void hienThi(){
        System.out.println("So Hoa Don: "+soHoaDon);
        System.out.println("Ten Khach Hang: "+tenKhachHang);
        System.out.println("Ngay mua: ");
        dates.display();
        hangHoa.hienThi();
        System.out.println("Tong tien hang la: "+tongTienHang());
        System.out.println("Tong tien thanh toan: "+tienPhaiTra());
    }
}

