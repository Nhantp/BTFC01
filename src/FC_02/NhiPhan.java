package FC_02;

import java.util.Scanner;

public class NhiPhan {
    Scanner scanner=new Scanner(System.in);
    public void input(int[] array, int n){
       for(int i=0; i<n; i++) {
           array[i] = scanner.nextInt();
       }
    }
    public void demBit(int[] array){
        int d=0;
        int count=0;
        for(int i=0;i<array.length; i++){
            if(array[i]%2==1){

            }
            d=d+array[i];
        }
    }

}
