package Test;
import java.util.Scanner;

public class dem {
    private static final Scanner scanner=new Scanner(System.in);
    static void random(int[] arr){
        for(int i=0; i<arr.length; i++){
            arr[i]= (int) (Math.random() * 9);
            System.out.print("  "+arr[i]);
        }
    }
    static int check(int[] arr){
//        System.out.println("\nNhap vao so can tim:");
//        int a=scanner.nextInt();
        int count=0;
        for (int i=0; i<arr.length; i++){
            if(i==arr[i])
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr=new int[10];
        random(arr);
        System.out.println("So lan xuat hien: "+check(arr));
        for (int i=0; i<=9; i++){
            System.out.println("So lan xuat hien:"+i+" "+check(arr));
        }

    }
}
