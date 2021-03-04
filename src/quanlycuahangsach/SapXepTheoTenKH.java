package quanlycuahangsach;

import java.util.Comparator;

public class SapXepTheoTenKH implements Comparator<KhachHang> {
    @Override
    public int compare(KhachHang o1, KhachHang o2) {
        return o1.getHoten().compareTo(o2.getHoten());
    }
}
