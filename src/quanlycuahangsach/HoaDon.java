package quanlycuahangsach;

import java.io.Serializable;
import java.util.Scanner;

public class HoaDon extends KhachHang implements Serializable {
    ListSachMua listSachMua= new ListSachMua();
    private String MaHD;
    private String NgayL;
    private String TenNV;

    public HoaDon(String hoten, String diaC, String gioiT, int SDT, ListSachMua listSachMua, String maHD, String ngayL, String tenNV) {
        super(hoten, diaC, gioiT, SDT);
        this.listSachMua = listSachMua;
        MaHD = maHD;
        NgayL = ngayL;
        TenNV = tenNV;
    }

    public HoaDon(){ super();}

    public ListSachMua getListSachMua() {
        return listSachMua;
    }

    public void setListSachMua(ListSachMua listSachMua) {
        this.listSachMua = listSachMua;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String maHD) {
        MaHD = maHD;
    }

    public String getNgayL() {
        return NgayL;
    }

    public void setNgayL(String ngayL) {
        NgayL = ngayL;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String tenNV) {
        TenNV = tenNV;
    }
    KhachHang khachHang;
    public void nhapHD(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nMa hoa don: ");
        MaHD = sc.nextLine();
        System.out.println("Ngay lap hoa don: ");
        NgayL = sc.nextLine();
        System.out.println("Ten nhan vien: ");
        TenNV = sc.nextLine();
        khachHang= new KhachHang();
        khachHang.nhap();//Khach hang
        ListKhachHang.listKhach.add(khachHang);
        System.out.println("Sach Mua: ");
        listSachMua.nhapDS();
    }


    public void xuatHD(){

        System.out.print("\nMa hoa don: "+MaHD);
        System.out.print("\nNgay lap: "+NgayL);
        System.out.print("\nNhan vien lap hoa don: "+TenNV);
        khachHang.xuat(); // xuat khach hang
        System.out.print("\nDanh sach sach mua:");
        listSachMua.xuatDS();
        System.out.println("-- Thanh Toan");
        System.out.println("==>Tong so luong: "+tongSLuong());
        System.out.println("==> Tong tien: "+ tongMoney());
    }
    public double tongMoney(){
        return listSachMua.tongTien();
    }
    public int tongSLuong(){
        return  listSachMua.tongSL();
    }

}
