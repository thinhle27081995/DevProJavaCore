package thinhluffy.com.coder.example02;

public class CanBo {
    private String maCB;
    private String hoTen;
    private String ngaySinh;
    private int soNgayLamViec;

    public CanBo() {

    }

    public CanBo(String maCB, String hoTen, String ngaySinh, int soNgayLamViec) {
        this.maCB = maCB;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.soNgayLamViec = soNgayLamViec;
    }

    public String getMaCB() {
        return maCB;
    }

    public void setMaCB(String maCB) {
        this.maCB = maCB;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getSoNgayLamViec() {
        return soNgayLamViec;
    }

    public void setSoNgayLamViec(int soNgayLamViec) {
        this.soNgayLamViec = soNgayLamViec;
    }
}
