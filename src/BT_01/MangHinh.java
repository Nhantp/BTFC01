package BT_01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MangHinh {
    ArrayList<HinhVuong> hinhVuongArrayList=new ArrayList<>();
    public ArrayList<HinhVuong> readHV(String filePath){
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        try {
             fileReader=new FileReader(filePath);
             bufferedReader=new BufferedReader(fileReader);
            String line;
            String[] temp;
            while ((line=bufferedReader.readLine())!=null){
                temp=line.split(" ");
                int a=Integer.parseInt(temp[0]);
//                int b=Integer.parseInt(temp[1]);
                HinhVuong hinhVuong=new HinhVuong(a);
                hinhVuongArrayList.add(hinhVuong);
//                HinhVuong hinhChuNhat=new HinhChuNhat(a,b);
//                hinhVuongArrayList.add(hinhChuNhat);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return hinhVuongArrayList;
    }
    public void display(){
        for(HinhVuong hinhVuong:hinhVuongArrayList){
            System.out.println(hinhVuong);
        }
    }
}
