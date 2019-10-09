package com.company.day02.exercise03;

public class Test {
    public static void main(String[] args) {
        PhieuBanHang phieuBanHang = new PhieuBanHang();
        QuanLyBanHang quanLy = new QuanLyBanHang();

        quanLy.nhapKhachHang(phieuBanHang);
        System.out.println("==== Loai Hang 1 =====");
        LoaiHang loaiHang1 = new LoaiHang();
        quanLy.nhap1(loaiHang1);
        quanLy.thanhTien1(loaiHang1);

        System.out.println("==== Loai Hang 2 =====");
        LoaiHang loaiHang2 = new LoaiHang();
        quanLy.nhap2(loaiHang2);
        quanLy.thanhTien2(loaiHang2);

        System.out.println("==== Loai Hang 3 =====");
        LoaiHang loaiHang3 = new LoaiHang();
        quanLy.nhap3(loaiHang3);
        quanLy.thanhTien3(loaiHang3);

        System.out.println("==== Loai Hang 4 =====");
        LoaiHang loaiHang4 = new LoaiHang();
        quanLy.nhap4(loaiHang4);
        quanLy.thanhTien4(loaiHang4);

        System.out.println("==== Loai Hang 5 =====");
        LoaiHang loaiHang5 = new LoaiHang();
        quanLy.nhap5(loaiHang5);
        quanLy.thanhTien5(loaiHang5);

        int tongTien = quanLy.thanhTien1(loaiHang1)+
                quanLy.thanhTien2(loaiHang2)+
                quanLy.thanhTien3(loaiHang3)+
                quanLy.thanhTien4(loaiHang4)+
                quanLy.thanhTien5(loaiHang5);

        System.out.println("===== Phieu mua hang =====");
        System.out.println("Ma phieu: "+phieuBanHang.getMaPhieu());
        System.out.println("Khach hang "+phieuBanHang.getTenKhachHang());
        System.out.println("Dien thoai: "+phieuBanHang.getSoDienThoai());

        System.out.format("%5s | ", "STT");
        System.out.format("%19s | ", "Ten Hang");
        System.out.format("%5s | ", "Don Vi Tinh");
        System.out.format("%5s | ", "So Luong");
        System.out.format("%10s |", "Don Gia(vnd)");
        System.out.format("%10s %n", "Thanh tien(vnd)");
        System.out.format("%5d | ", 1);
        System.out.format("%19s | ", loaiHang1.getTenHang1());
        System.out.format("%11s | ", loaiHang1.getDonViTinh1());
        System.out.format("%8d | ", loaiHang1.getSoLuong1());
        System.out.format("%,12d |", loaiHang1.getDonGia1());
        System.out.format("%,14d %n", quanLy.thanhTien1(loaiHang1));
        System.out.format("%5d | ", 2);
        System.out.format("%19s | ", loaiHang2.getTenHang2());
        System.out.format("%11s | ", loaiHang2.getDonViTinh2());
        System.out.format("%8d | ", loaiHang2.getSoLuong2());
        System.out.format("%,12d |", loaiHang2.getDonGia2());
        System.out.format("%,14d %n", quanLy.thanhTien2(loaiHang2));
        System.out.format("%5d | ", 3);
        System.out.format("%19s | ", loaiHang3.getTenHang3());
        System.out.format("%11s | ", loaiHang3.getDonViTinh3());
        System.out.format("%8d | ", loaiHang3.getSoLuong3());
        System.out.format("%,12d |", loaiHang3.getDonGia3());
        System.out.format("%,14d %n", quanLy.thanhTien3(loaiHang3));
        System.out.format("%5d | ", 4);
        System.out.format("%19s | ", loaiHang4.getTenHang4());
        System.out.format("%11s | ", loaiHang4.getDonViTinh4());
        System.out.format("%8d | ", loaiHang4.getSoLuong4());
        System.out.format("%,12d |", loaiHang4.getDonGia4());
        System.out.format("%,14d %n", quanLy.thanhTien4(loaiHang4));
        System.out.format("%5d | ", 5);
        System.out.format("%19s | ", loaiHang5.getTenHang5());
        System.out.format("%11s | ", loaiHang5.getDonViTinh5());
        System.out.format("%8d | ", loaiHang5.getSoLuong5());
        System.out.format("%,12d |", loaiHang5.getDonGia5());
        System.out.format("%,14d %n", quanLy.thanhTien5(loaiHang5));
        System.out.format("%n");
        System.out.format("Cong thanh tien: %,40d (nghin vnd)",tongTien);
    }
}
