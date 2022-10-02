package FC_01.doc_ghi_file1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    static List<String> stringList = new ArrayList<>();
    public static List<String> reaFile(String filePath){
        try {
           FileReader fileReader=new FileReader(filePath);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line;
            String[] temp;
            while ((line=bufferedReader.readLine())!=null){
                stringList.add(line);
                System.out.println(line);
            }
            bufferedReader.close();
        }catch (IOException e){
            System.out.println("loi file");
        }
        return stringList;
    }
    public static void writeFile(String filePath,List<String>stringList){
        try {
           FileWriter fileWriter=new FileWriter(filePath);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            for(String string:stringList){
                bufferedWriter.write(string);
                bufferedWriter.write("\n");
            }
            bufferedWriter.close();
        }catch (IOException e){
            System.out.println("Loi file");
        }
    }
    public static void main(String[] args) {
     reaFile("D:\\BTFC01\\FC01\\src\\FC_01\\doc_ghi_file1\\source");
     writeFile("D:\\BTFC01\\FC01\\src\\FC_01\\doc_ghi_file1\\dest",stringList);
    }
}
