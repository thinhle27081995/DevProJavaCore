package com.company.day02.exercise02;

public class Test {
    public static void main(String[] args) {
        System.out.println(" === Hoc Sinh 1 ====");
        MonHoc monHoc1 = new MonHoc();
        HocSinh hocSinh1 = new HocSinh();
        QuanLyThongTin quanLyThongTin1 = new QuanLyThongTin();
        quanLyThongTin1.nhapMon1(hocSinh1,monHoc1);
        quanLyThongTin1.xuat1(hocSinh1,monHoc1);
        System.out.println("Diem TB 1 "+quanLyThongTin1.diemTB1(monHoc1));

        System.out.println(" === Hoc Sinh 2 ====");
        MonHoc monHoc2 = new MonHoc();
        HocSinh hocSinh2 = new HocSinh();
        QuanLyThongTin quanLyThongTin2 = new QuanLyThongTin();
        quanLyThongTin2.nhapMon2(hocSinh2,monHoc2);
        quanLyThongTin2.xuat2(hocSinh2,monHoc2);
        System.out.println("Diem TB 2 "+quanLyThongTin2.diemTB2(monHoc2));

        System.out.println(" === Hoc Sinh 3 ====");
        MonHoc monHoc3 = new MonHoc();
        HocSinh hocSinh3 = new HocSinh();
        QuanLyThongTin quanLyThongTin3 = new QuanLyThongTin();
        quanLyThongTin3.nhapMon3(hocSinh3,monHoc3);
        quanLyThongTin3.xuat3(hocSinh3,monHoc3);
        System.out.println("Diem TB 3 "+quanLyThongTin3.diemTB3(monHoc3));

        System.out.println(" === Hoc Sinh 4 ====");
        MonHoc monHoc4 = new MonHoc();
        HocSinh hocSinh4 = new HocSinh();
        QuanLyThongTin quanLyThongTin4 = new QuanLyThongTin();
        quanLyThongTin4.nhapMon4(hocSinh4,monHoc4);
        quanLyThongTin4.xuat4(hocSinh4,monHoc4);
        System.out.println("Diem TB 4 "+quanLyThongTin4.diemTB4(monHoc4));

        System.out.println(" === Hoc Sinh 5 ====");
        MonHoc monHoc5 = new MonHoc();
        HocSinh hocSinh5 = new HocSinh();
        QuanLyThongTin quanLyThongTin5 = new QuanLyThongTin();
        quanLyThongTin5.nhapMon5(hocSinh5,monHoc5);
        quanLyThongTin1.xuat5(hocSinh5,monHoc5);
        System.out.println("Diem TB 5 "+quanLyThongTin5.diemTB5(monHoc5));

        System.out.println("==== Tong trung binh chung ======");
        float tongTBCacMon = quanLyThongTin1.diemTB1(monHoc1)+
                quanLyThongTin2.diemTB2(monHoc2)+
                quanLyThongTin3.diemTB3(monHoc3)+
                quanLyThongTin4.diemTB4(monHoc4)+
                quanLyThongTin5.diemTB5(monHoc5);
        float tongTBChung = tongTBCacMon/(float)5;
        System.out.println(" Tong "+tongTBChung);
    }
}
