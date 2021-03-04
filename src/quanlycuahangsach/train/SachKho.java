package quanlycuahangsach.train;

import quanlycuahangsach.Sach;
import java.util.Scanner;
public class SachKho extends Sach {
    private int soTrang;
    private int soL;
    private String nxb;
    public SachKho(String maS, String tenS, String tenTG, float giaT, int soTrang, int soL, String nxb){
        super(maS, tenS, tenTG, giaT);
        this.soTrang= soTrang;
        this.soL= soL;
        this.nxb= nxb;
    }
    public SachKho(){
        super();
    }
    public void setSoTrang(int soTrang){
        this.soTrang= soTrang;
    }
    public int getSoTrang(){
        return this.soTrang;
    }
    public void setSoL(int soL){
        this.soL= soL;
    }
    public int getSoL(){
        return this.soL;
    }
    public void setNxb(String nxb){
        this.nxb= nxb;
    }
    public String getNxb(){
        return this.nxb;
    }
    public void nhap(){
        super.nhap();
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap so trang: ");
        soTrang= sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten NXB: ");
        nxb= sc.nextLine();
        System.out.println("Nhap So Luong: ");
        soL= sc.nextInt();
    }
    public void xuat(){
        super.xuat();
        System.out.println("So trang: "+soTrang);
        System.out.println("NXB: "+nxb);
        System.out.println("So Luong: "+soL);
        System.out.println("Thanh tien: "+thanhTien());
    }
    public double thanhTien(){
        return soL*getGiaT();
    }
}
