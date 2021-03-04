package quanlycuahangsach;

import java.util.Comparator;

public class sortByMoney implements Comparator<SachMua> {
    @Override
    public int compare(SachMua o1, SachMua o2) {
        if(o1.thanhTien() < o2.thanhTien()){
            return 1;
        }else if(o1.thanhTien() > o1.thanhTien()){
            return -1;
        }
        return 0;
    }
}
