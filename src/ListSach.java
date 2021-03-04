import quanlycuahangsach.Sach;

import java.util.ArrayList;
import java.util.Scanner;

public class ListSach {
    ArrayList<Sach> listSach = new ArrayList<>();
    void nhapDS(){
        int op;
        Sach sach;
        do{
            sach = new Sach();
   //         sach.nhap();
            listSach.add(sach);
            Scanner sc = new Scanner(System.in);
            System.out.println("\nTiep tuc nhap du lieu?\n1.Yes\t0.No");
            op = sc.nextInt();
        }while(op!=0);
        for(int i=0; i<listSach.size(); i++){
            for(int j=i+1; j<listSach.size(); j++){
                if(listSach.get(i).getMaS().equalsIgnoreCase(listSach.get(j).getMaS())){
                    listSach.remove(listSach.get(j));
                }
            }
        }
    }
    void xuatDS(){

        for(Sach i : listSach){
            System.out.println("-------");
   //         i.xuat();
        }
    }
    public boolean SearchSach(String ma){
        int d=0;
        for(Sach i : listSach){
            if(i.getMaS().equalsIgnoreCase(ma)){
                d+=1;
            }
        }
        if (d!=0)
        {
            return  true;
        }
        return false;
    }
    public void timSach(String ma) {
        for( int i=0; i<listSach.size(); i++){
            if(listSach.get(i).getMaS().equalsIgnoreCase(ma)){

            }
        }
    }
    public float giaS(String ma) {
        for(Sach i: listSach){
            if(i.getMaS().equalsIgnoreCase(ma)){
                return i.getGiaT();
            }
        }
        return 0;
    }

    public void menu(){

    }
}
