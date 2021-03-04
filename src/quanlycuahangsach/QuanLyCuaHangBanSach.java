package quanlycuahangsach;

import java.util.Scanner;

public class QuanLyCuaHangBanSach {
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        do {
            int c;
            System.out.println("\n\t\t\t\t=========== QUAN LY CUA HANG SACH ===========");
            System.out.println("\t\t\t\t1. HOA DON");
            System.out.println("\t\t\t\t2. KHACH HANG");
            System.out.println("\t\t\t\t3. THOAT");
            c = sc.nextInt();
            switch (c) {
                case 1:
                    ListHoaDon listHoaDon= new ListHoaDon();
                    int ch=-1;
                {
                    Scanner sch = new Scanner(System.in);
                    do {

                        System.out.println("\n\t\t\t\t=========== Danh Sach Hoa Don ===========");
                        System.out.println("\t\t\t\t1. Nhap Danh Sach Hoa Don");
                        System.out.println("\t\t\t\t2. Xuat Danh Sach Hoa Don");
                        System.out.println("\t\t\t\t3. Tong So Luong Sach Da Ban");
                        System.out.println("\t\t\t\t4. Tong Tien Thu");
                        System.out.println("\t\t\t\t5. Sap xep theo gia tri hoa don");
                        System.out.println("\t\t\t\t6. Luu File");
                        System.out.println("\t\t\t\t7. Doc File");
                        System.out.println("\t\t\t\t8. Thoát");
                        ch = sch.nextInt();
                        switch (ch) {
                            case 1: listHoaDon.NhapDS(); break;
                            case 2: listHoaDon.XuatDS(); break;
                            case 3: listHoaDon.TongSoBan(); break;
                            case 4: listHoaDon.TongTienThu(); break;
                            case 5: listHoaDon.sortGT(); break;
                            case 6: listHoaDon.luuF(); break;
                            case 7: listHoaDon.docF(); break;
                            case 8:
                                System.err.println("Tạm Biệt!!!!!");

                                break;
                            default:
                                System.out.println("Ban nhap sai! Moi ban nhap lai!");
                        }
                    }while (ch!=8);
                }
                    break;
                case 2:
                    {
                    ListKhachHang listKhachHang = new ListKhachHang();
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
                            case 1: listKhachHang.xuatDSKH(); break;
                            case 2: listKhachHang.sapXepTen(); break;
                            case 3: listKhachHang.luuF(); break;
                            case 4: listKhachHang.docF(); break;
                            case 5:
                                System.err.println("Tạm Biệt!!!!!");
                                break;
                            default:
                                System.out.println("Ban nhap sai! Moi ban nhap lai!");
                        }
                    }while (ck!=5);
                    }
                    break;
                case 3:
                    System.err.println("Tạm Biệt!!!!!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Bạn nhập sai! mười nhập lại!");
            }
        }while (true);
    }
}
