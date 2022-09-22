package FC_01.doc_ghi_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileList {
    private static final String FILE_NAME="D:\\BTFC01\\FC01\\src\\FC_01\\doc_ghi_file\\datalist";
    public static List<String>readList(){
        List<String>strings=new ArrayList<>();
        try {
            File file=new File(FILE_NAME);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            String line;
            BufferedReader bufferedReader=new BufferedReader(new FileReader(FILE_NAME));
            while ((line=bufferedReader.readLine())!=null){
                strings.add(line);
                System.out.println(line);
                bufferedReader.readLine();
            }
            bufferedReader.close();
        }catch (IOException e){
            System.out.println("Loi file");
        }
        return strings;
    }

    public static void main(String[] args) {

        readList();
    }
}
