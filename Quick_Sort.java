import java.util.Arrays;

public class Quick_Sort {
    int partition(int [] arr,int low,int high){
        int pivot=arr[(low+high)/2];
        while(low<=high){
            while(arr[low]<pivot){
                low++;
            }
            while(arr[high]>pivot){
                high--;
            }
            if(low<=high){
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;
                high--;
            }

        }
        return low;
    }
    void recurssion(int [] arr,int low,int high){
        int pi=partition(arr,low,high);
        if(low<pi-1){
            recurssion(arr,low,pi-1);
        }
        if(pi<high){
            recurssion(arr,pi,high);
        }
    }
    void printA(int [] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
      int [] arr={22,1,334,2,11,5};
      int len= arr.length;
      Quick_Sort qs=new Quick_Sort();
      qs.recurssion(arr,0,len-1);
      qs.printA(arr);
    }

}
