package quanlycuahangsach;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListKhachHang {
    static ArrayList<KhachHang> listKhach = new ArrayList<>();

    public void nhapDSKH(){
        int op;
        do{
            KhachHang khachHang = new KhachHang();
            khachHang.nhap();
            listKhach.add(khachHang);
            Scanner sc = new Scanner(System.in);
            System.out.print("\nTiep tuc nhap du lieu?\n1.Yes\t0.No");
            op = sc.nextInt();
        }while(op!=0);
    }


    public void xuatDSKH(){
        for(KhachHang khachHang : listKhach){
            khachHang.xuat();
        }
    }
    public void luuF(){
        String tenf;
        System.out.println("Nhập tên file muốn lưu: ");
        String link="C:\\Users\\NGO VAN TOAN\\Desktop\\FileJava\\";
        tenf= new Scanner(System.in).nextLine();
        String source= link+tenf;
        boolean check= FileKH.saveFile(listKhach, source);
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
        ArrayList<KhachHang> listt= new ArrayList<KhachHang>();
        listt= FileKH.readFile(source);
        if( listt.size() == 0){
            System.out.println("File rỗng hoặc chưa có file "+ tenf);
        }else{
            for(KhachHang khachHang : listt){
                khachHang.xuat();
            }
        }
    }
    public void sapXepTen(){
        Collections.sort(listKhach, new SapXepTheoTenKH());
        System.out.println("Ds Sau Khi sap Xep");
        xuatDSKH();
    }
    /*
    public void menu(){
        Scanner sck = new Scanner(System.in);
        int ck=-1;
        do {

            System.out.println("\n\t\t\t\t===========  Khach Hang ===========");
            System.out.println("\t\t\t\t1. Xuat Danh Sach KH");
            System.out.println("\t\t\t\t2. Sap Xep Khach Hang Theo Ten");
            System.out.println("\t\t\t\t3. Luu File KH");
            System.out.println("\t\t\t\t4. Doc File KH");
            System.out.println("\t\t\t\t5. Thoát");
            ck = sck.nextInt();
            switch (ck) {
                case 1: xuatDSKH(); break;
                case 2: sapXepTen(); break;
                case 3: docF(); break;
                case 4: luuF(); break;
                case 5:
                    System.err.println("Tạm Biệt!!!!!");
                    break;
                default:
                    System.out.println("Ban nhap sai! Moi ban nhap lai!");
            }
        }while (ck!=5);
    }

     */
}
