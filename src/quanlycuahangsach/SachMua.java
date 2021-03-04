package quanlycuahangsach;


import java.io.Serializable;
import java.util.Scanner;

public class SachMua extends Sach implements Serializable {
    private int SoL;
    private float GiamG;

    public SachMua(String maS, String tenS, String tenTG, float giaT, int soL) {
        super(maS, tenS, tenTG, giaT);
        SoL = soL;
    }

    public SachMua() {
        super();
    }

    public int getSoL() {
        return SoL;
    }

    public void setSoL(int soL) {
        SoL = soL;
    }

    public float getGiamG() {
        return GiamG;
    }

    public void setGiamG(float giamG) {
        GiamG = giamG;
    }

    void nhapSM(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("So luong: ");
        SoL = sc.nextInt();
        System.out.println("Giam gia: ");
        GiamG = sc.nextFloat();
    }

    void xuatSM(){
        super.xuat();
        System.out.println("\nSo luong mua: "+SoL);
        System.out.println("Giam gia: "+GiamG);
       System.out.println("Thanh Tien: "+thanhTien());
    }


    public double thanhTien(){
        return SoL*getGiaT()-(SoL*GiamG*getGiaT());
    }


}
