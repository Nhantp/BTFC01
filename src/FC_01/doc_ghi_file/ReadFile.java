package FC_01.doc_ghi_file;

import java.io.*;

public class ReadFile {
  public static void read(String filePath){
      try {
          File file=new File(filePath);
          if(!file.exists()){
              throw new FileNotFoundException();
          }
          String line;
          BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
          while ((line=bufferedReader.readLine())!=null){
              System.out.println(line);
          }

      }catch (IOException e){
          System.out.println("Loi file");
      }
  }

    public static void main(String[] args) {
        read("D:\\BTFC01\\FC01\\src\\FC_01\\doc_ghi_file\\data");
    }
}
