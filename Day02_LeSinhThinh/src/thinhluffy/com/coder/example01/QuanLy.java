package thinhluffy.com.coder.example01;

import java.util.ArrayList;

public class QuanLy {
    private ArrayList<HocSinh> listHS;

    public QuanLy() {
        this.listHS = new ArrayList<>();
    }
    public void themHS(String ten,int tuoi){
        listHS.add(new HocSinh(ten,tuoi));
    }
    public void inTenHS(){
        for (int i=0;i<listHS.size();i++){
            HocSinh hs = listHS.get(i);
            System.out.println("Ten HS thu "+i+":"+hs.getTen());
            System.out.println("Tuoi HS thu "+i+":"+hs.getTuoi());
        }
    }
}
