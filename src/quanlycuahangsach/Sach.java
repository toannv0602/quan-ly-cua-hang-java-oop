package quanlycuahangsach;

import java.io.Serializable;
import java.util.Scanner;

public class Sach implements Serializable {
    private String MaS;
    private String TenS;
    private String TenTG;
    private float GiaT;

    public Sach(String maS, String tenS, String tenTG, float giaT) {
        MaS = maS;
        TenS = tenS;
        TenTG = tenTG;
        GiaT = giaT;
    }

    public Sach() {
    }

    public String getMaS() {
        return MaS;
    }

    public void setMaS(String maS) {
        MaS = maS;
    }

    public String getTenS() {
        return TenS;
    }

    public void setTenS(String tenS) {
        TenS = tenS;
    }

    public String getTenTG() {
        return TenTG;
    }

    public void setTenTG(String tenTG) {
        TenTG = tenTG;
    }

    public float getGiaT() {
        return GiaT;
    }

    public void setGiaT(float giaT) {
        GiaT = giaT;
    }

    public void xuat(){
        System.out.print("\nMa sach: "+MaS);
        System.out.print("\nTen sach: "+TenS);
        System.out.print("\nTen tac gia: "+TenTG);
        System.out.printf("\nGia tien: %7.3f",GiaT);
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ma Sach");
        MaS = sc.nextLine();

        System.out.println("Ten sach: ");
        TenS = sc.nextLine();
        System.out.println("Ten tac gia: ");
        TenTG = sc.nextLine();
        System.out.println("Gia tien: ");
        GiaT = sc.nextFloat();
    }
}
