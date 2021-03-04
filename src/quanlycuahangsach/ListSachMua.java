package quanlycuahangsach;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListSachMua {
    ArrayList<SachMua> listSM= new ArrayList<>() ; //list Sach mua

    public ListSachMua(ArrayList<SachMua> listSM) {
        this.listSM = listSM;
    }
    public ListSachMua(){ listSM= new ArrayList<>();}

    public ArrayList<SachMua> getListSM() {
        return listSM;
    }

    public void setListSM(ArrayList<SachMua> listSM) {
        this.listSM = listSM;
    }
    public void nhapDS(){
        int op;
        do{
            SachMua x = new SachMua();
            x.nhapSM();
            listSM.add(x);
            Scanner sc = new Scanner(System.in);
            System.out.println("\nTiep Tuc Nhap Sach?\n1.Yes\t0.No");
            op = sc.nextInt();
        }while(op!=0);
    }
    public void xuatDS(){
        for( SachMua sachMua : listSM){
            sachMua.xuatSM();
        }
    }
    // tim kiem theo ma sach
    public void searchMaS(){
        System.out.println("Nhap ma sach can tim: ");
        String maS;
        maS= new Scanner(System.in).nextLine();
        for(SachMua sm : listSM){
            if(sm.getMaS().equalsIgnoreCase(maS)){
                sm.xuatSM();
            }
        }
    }
    // sap xep theo gia tien
    public void sapXepGia(){
        Collections.sort(listSM, new sortByMoney());
        System.out.println("Danh sach sau khi sap xep: ");
        xuatDS();
    }

    public double tongTien(){
        double sumM=0;
        for(SachMua sachMua : listSM){
            sumM+= sachMua.thanhTien();
        }
        return sumM;
    }


    public int tongSL(){
        int sumSL=0;
        for( SachMua sachMua : listSM){
            sumSL+= sachMua.getSoL();
        }
        return sumSL;
    }
}
