package FC_01.Test;
public class sort {
    public static void main(String[] args) {
        int[] arr={1,5,6,7,3,8};
        int tmp;
        for(int i=0; i<arr.length-1;i++){
            for(int j=i+1; j< arr.length; j++){
                if(arr[i]>arr[j]){
                    tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
        for(int i=0; i< arr.length-1; i++){
            System.out.println(arr[i]);
        }
    }
}
