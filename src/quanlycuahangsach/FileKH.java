package quanlycuahangsach;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileKH {
    public static boolean saveFile(ArrayList<KhachHang> list, String path){
        ArrayList<KhachHang> list1= new ArrayList<>();
      //  list1 = readFile(path);
        try{
            FileOutputStream fot= new FileOutputStream(path);
            ObjectOutputStream oos= new ObjectOutputStream(fot);
       //     oos.writeObject(list1);
            oos.writeObject(list);
            oos.close();
            fot.close();
            return true;
        }catch (Exception ex){
            ex.printStackTrace();

        }
        return false;
    }
    public static ArrayList<KhachHang> readFile(String path){
        ArrayList<KhachHang> listR= new ArrayList<>();
        try {
            FileInputStream fis= new FileInputStream(path);
            ObjectInputStream ois= new ObjectInputStream(fis);
            Object data= ois.readObject();
            listR= (ArrayList<KhachHang>) data;
            ois.close();
            fis.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return listR;
    }
}
