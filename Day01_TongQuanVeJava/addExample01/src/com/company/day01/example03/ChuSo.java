package com.company.day01.example03;

public class ChuSo {
    static int n=276491;
    static int so1(){
        return n%10;
    }
    static int so2(){
        return n/10%10;
    }
    static int so3(){
        return n/100%10;
    }
    static int so4(){
        return n/1000%10;
    }
    static int so5(){
        return n/10000%10;
    }
    static int so6(){
        return n/100000%10;
    }
    static int tongChuSo(){
        return so1()+so2()+so3()+so4()+so5()+so6();
    }
    static float trungBinhCong(){
        return (float)tongChuSo()/6;
    }
    public static void main(String[] args) {
        System.out.println(so1());
        System.out.println(so2());
        System.out.println(so3());
        System.out.println(so4());
        System.out.println(so5());
        System.out.println(so6());
        System.out.println("Tong cac so la: "+tongChuSo());
        System.out.println("Trung binh cong la: "+trungBinhCong());
    }
}
