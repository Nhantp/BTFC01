package FC_01.Test;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao so luong phan tu:");
        int a=scanner.nextInt();
        int[] array= new int[a];

        for (int i=0; i<array.length; i++){
            array[i]= (int) (Math.random()*100);
            System.out.println(array[i]);
        }
        int sum=0;
        int index=0;
        for(int i=0; i<array.length; i++){
            if(array[i]%2!=0){
                sum+=array[i];
                index+=1;

            }
        }
        System.out.println((float) sum/index);
    }

}
