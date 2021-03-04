package quanlycuahangsach;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileDSHD {
    public static boolean saveFile(ArrayList<HoaDon> listHD, String path){
      //  ArrayList<HoaDon> listH= new ArrayList<>();

        try{
        //    listH = readFile(path);
            FileOutputStream fot= new FileOutputStream(path);
            ObjectOutputStream oos= new ObjectOutputStream(fot);
          //  oos.writeObject(listH);
            oos.writeObject(listHD);
            oos.close();
            fot.close();
            return true;
        }catch (Exception ex){
            ex.printStackTrace();

        }
        return false;
    }
    public static ArrayList<HoaDon> readFile(String path){
        ArrayList<HoaDon> listHD= new ArrayList<>();
        try {
            FileInputStream fis= new FileInputStream(path);
            ObjectInputStream ois= new ObjectInputStream(fis);
            Object data= ois.readObject();
            listHD= (ArrayList<HoaDon>) data;
            ois.close();
            fis.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return listHD;
    }
}
