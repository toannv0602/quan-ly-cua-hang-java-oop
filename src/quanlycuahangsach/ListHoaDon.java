package quanlycuahangsach;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListHoaDon {
    ArrayList<HoaDon> listHoaDon = new ArrayList<>();

    public ArrayList<HoaDon> getListHoaDon() {
        return listHoaDon;
    }

    public void setListHoaDon(ArrayList<HoaDon> listHoaDon) {
        this.listHoaDon = listHoaDon;
    }

    public ListHoaDon() {
    }

    public ListHoaDon(ArrayList<HoaDon> listHoaDon) {
        this.listHoaDon = listHoaDon;
    }

    public void NhapDS(){
        int op;
        do{
            HoaDon hoaDon = new HoaDon();
            hoaDon.nhapHD();
            listHoaDon.add(hoaDon);
            Scanner sc = new Scanner(System.in);
            System.out.println("\nNhap Hoa Don Tiep Theo?\n1.Yes\t0.No");
            op = sc.nextInt();
        }while(op!=0);
    }
    public void XuatDS(){
        int i=0;
        for(HoaDon hoaDon : listHoaDon){
            i+=1;
            System.out.println("--------- Hoa Don Thu "+(i));
            hoaDon.xuatHD();
        }
    }
    public void TongSoBan(){
        int tongSL=0;
        for(HoaDon hoaDon : listHoaDon){
            tongSL+= hoaDon.tongSLuong();
        }
        System.out.println("\nTong sach da ban: "+tongSL);
    }
    public void TongTienThu(){
        double tongTien = 0;
        for(HoaDon hoaDon : listHoaDon){
            tongTien += hoaDon.tongMoney();
        }
        System.out.println("\nTong tien thu ve: "+ tongTien+"VND");
    }
    public void luuF(){
        String tenf;
        System.out.println("Nhập tên file muốn lưu: ");
        String link="C:\\Users\\NGO VAN TOAN\\Desktop\\FileJava\\";
        tenf= new Scanner(System.in).nextLine();
        String source= link+tenf;
        boolean check= FileDSHD.saveFile(listHoaDon, source);
        if(check){
            System.out.println("Lưu thành công!");
        }else{
            System.out.println("Lưu thất bại!");
        }
    }
    public void docF(){
        String tenf;
        System.out.println("Nhập tên file muốn đọc: ");
        String link="C:\\Users\\NGO VAN TOAN\\Desktop\\FileJava\\";
        tenf= new Scanner(System.in).nextLine();
        String source= link+tenf;
        listHoaDon = FileDSHD.readFile(source);
        if( listHoaDon.size() == 0){
            System.out.println("File rỗng hoặc chưa có file "+ tenf);
        }else{
            for(HoaDon hoaDon : listHoaDon){
                hoaDon.xuatHD();
            }
        }
    }
    // sap xep theo gia tri hoa don
    public void sortGT(){
        Collections.sort(listHoaDon, new SXByGTri());
        System.out.println("DS Hoa Don Sau Khi Sap Xep: ");
        XuatDS();
    }
    /*
    public void menu(){
        Scanner sc = new Scanner(System.in);
        do {
            int c;
            System.out.println("\n\t\t\t\t=========== Danh Sach Hoa Don ===========");
            System.out.println("\t\t\t\t1. Nhap Danh Sach Hoa Don");
            System.out.println("\t\t\t\t2. Xuat Danh Sach Hoa Don");
            System.out.println("\t\t\t\t3. Tong So Luong Sach Da Ban");
            System.out.println("\t\t\t\t4. Tong Tien Thu");
            System.out.println("\t\t\t\t5. Sap xep theo gia tri hoa don");
            System.out.println("\t\t\t\t6. Luu File");
            System.out.println("\t\t\t\t7. Doc File");
            System.out.println("\t\t\t\t8. Thoát");
            c = sc.nextInt();
            switch (c) {
                case 1: NhapDS(); break;
                case 2: XuatDS(); break;
                case 3: TongSoBan(); break;
                case 4: TongTienThu(); break;
                case 5: sortGT(); break;
                case 6: luuF(); break;
                case 7: docF(); break;
                case 8:
                    System.err.println("Tạm Biệt!!!!!");

                    break;
                default:
                    System.out.println("Ban nhap sai! Moi ban nhap lai!");
            }
        }while (true);
    }

     */
}
