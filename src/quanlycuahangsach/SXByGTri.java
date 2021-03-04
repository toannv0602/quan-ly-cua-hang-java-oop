package quanlycuahangsach;

import java.util.Comparator;

// Sap xep Theo Gia tri moi hoa don
public class SXByGTri implements Comparator<HoaDon> {
    @Override
    public int compare(HoaDon o1, HoaDon o2) {
        if(o1.tongMoney() < o2.tongMoney()){
            return 1;
        }else if(o1.tongMoney() >o2.tongMoney()){
            return -1;
        }
        return 0;
    }
}
