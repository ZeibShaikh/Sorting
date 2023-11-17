import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int [] arr={111,2,333,44,5,6};
        for(int i=0;i< arr.length-1;i++){
            for(int j=0;j< arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
