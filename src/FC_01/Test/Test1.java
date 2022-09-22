package FC_01.Test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] a={4,1,2,3,4,1,2,1,2,1};
//        for(int i=0;i<a.length;i++){
//            a[i]=sc.nextInt();
//        }
        int dem=1;
        int demct=0;
        for(int i=0;i<a.length-1;i++) {
            dem = 1;
            if (dem >= 3) {
                demct++;
                System.out.println("da tang i= " + i);

            } else {
                while (dem >= 3) {
                    if (a[i] < a[i + 1]) {
                        dem++;
                    } else {
                        demct++;
                        System.out.println("da tang i= " + i);

                        dem =1;
                        dem++;


                    }
                }
            }
        }

        System.out.println("so luong mang tang la: "+demct);
    }
}
