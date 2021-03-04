package quanlycuahangsach;

import java.io.Serializable;
import java.util.Scanner;

public class KhachHang implements Serializable {
    private String Hoten;
    private String DiaC;
    private String GioiT;
    private int SDT;
    KhachHang(){
    }

    public KhachHang(String hoten, String diaC, String gioiT, int SDT) {
        Hoten = hoten;
        DiaC = diaC;
        GioiT = gioiT;
        this.SDT = SDT;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
    }

    public String getDiaC() {
        return DiaC;
    }

    public void setDiaC(String diaC) {
        DiaC = diaC;
    }

    public String getGioiT() {
        return GioiT;
    }

    public void setGioiT(String gioiT) {
        GioiT = gioiT;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }

    void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ho ten khach hang: ");
        this.Hoten = sc.nextLine();
        System.out.println("Dia chi: ");
        this.DiaC = sc.nextLine();
        System.out.println("Gioi tinh: ");
        this.GioiT = sc.nextLine();
        System.out.println("So dien thoai: ");
        this.SDT = sc.nextInt();
    }
    void xuat() {
        System.out.println("----");
        System.out.println("Ho ten khach: "+ this.Hoten);
        System.out.println("Dia chi: "+this.DiaC);
        System.out.println("Gioi tinh: "+this.GioiT);
        System.out.println("So dien thoai: "+this.SDT);
    }

}
