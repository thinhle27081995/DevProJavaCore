package thinhluffy.com.coder.example02;

import java.util.Scanner;

public class QuanLyCanBo {
    private CanBo canBo[];
    private Scanner scanner;
    private int soCanBo;

    public QuanLyCanBo() {
        scanner = new Scanner(System.in);
        System.out.println("Nhap so can bo: ");
        soCanBo= scanner.nextInt();
        scanner.nextLine();
        canBo = new CanBo[soCanBo];
    }
    public void nhap(){
        System.out.println("Nhap vao can bo : ");
        for (int i=0; i<soCanBo; i++){
            System.out.println("Nhap ma can bo: ");
            canBo[i]=new CanBo();
            canBo[i].setMaCB(scanner.nextLine());
        }
    }
    public void xuat(){
        System.out.println("Xuat can bo");
        for (int i =0; i< soCanBo; i++){
            System.out.println("Ma can bo: "+canBo[i].getMaCB());
            System.out.println("Ten can bo: "+canBo[i].getHoTen());
            System.out.println("Ngay sinh can bo: "+canBo[i].getNgaySinh());
            System.out.println("So ngay lam viec: "+canBo[i].getSoNgayLamViec());
            System.out.println("Luong can bo "+luongCanBo());
        }
    }
    public int luongCanBo(){
        boolean check = true;
        int luong =0;
        for (int i=0; i<soCanBo; i++){
            if (canBo[i].getSoNgayLamViec()==0){
                System.out.println("Khong co luong "+luong);
                check = false;
            }
            if (check){
                luong = canBo[i].getSoNgayLamViec()*450000;
            }
        }
        return luong;
    }
}
