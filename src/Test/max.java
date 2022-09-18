package Test;

public class max {
    public static void main(String[] args) {
        int[] arr={1,24,5,2,53,5};
        int max=arr[0];
        for(int i=0; i<arr.length-1; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
