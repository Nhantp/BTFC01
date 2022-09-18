package Test;

public class sort1 {
    public static void main(String[] args) {
        int[] arr={4,5,3,6,873,2,42,1};
        int tmp;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
