package FC_01.hinh;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadAndWriteHinhHoc {
    public ArrayList<HinhHoc> readFile(String filePath){
        ArrayList<HinhHoc>hinhHocArrayList=new ArrayList<>();
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        try {
             fileReader=new FileReader(filePath);
             bufferedReader=new BufferedReader(fileReader);
            String line;
            String[] str;
            while ((line=bufferedReader.readLine())!=null){
                str=line.split(",");
                int id= Integer.parseInt(str[0]);
                double radian= Double.parseDouble(str[1]);

            }
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                fileReader.close();
                bufferedReader.close();
            }catch (IOException e){
                throw new RuntimeException();
            }
        }
        return hinhHocArrayList;
    }
}
