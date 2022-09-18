package Test;

import java.util.Scanner;

public class demo1 {
    static int riseFour(int[] arr) {
        int count=0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]>arr[i+1]) {
                count++;
            }
            if(count==2) {
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        if(riseFour(arr)==1){
            System.out.println("True");
        }else {
            System.out.println("false");
        }


    }
}
