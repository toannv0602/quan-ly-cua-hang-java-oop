package quanlycuahangsach.train;
import java.util.ArrayList;
import java.util.Scanner;
import quanlycuahangsach.Sach;

import quanlycuahangsach.train.SachKho;
public class QuanLySachKho {
    ArrayList<Sach> listKho = new ArrayList<>();
    public QuanLySachKho(){}

    public QuanLySachKho(ArrayList<Sach> listKho) {
        this.listKho = listKho;
    }

    public void nhapDS(){
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("So Luong sach nhap: ");
        n= sc.nextInt();
        for(int i=0; i<n; i++){
            Sach sach= new SachKho();
            sach.nhap();
            listKho.add(sach);
        }
    }
    public void xuatDS(){
        for( Sach s: listKho ){
            s.xuat();
        }
    }
}
