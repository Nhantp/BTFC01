package FC_01.doc_ghi_file;

import java.io.*;

public class WriteFile {
    private static final String FILE_NAME="D:\\BTFC01\\FC01\\src\\FC_01\\doc_ghi_file\\result";
    public static void write(){
        try {
            File file=new File(FILE_NAME);
            BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(file));
            bufferedWriter.write("1,2,3,4");
            bufferedWriter.close();

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        write();
    }
}
