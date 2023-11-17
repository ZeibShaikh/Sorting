public class Insertion_Sort {
    public static void main(String[] args) {
       int[] arr={5,1,8,92,11,3};
       int temp,j;
       for(int i=0;i<arr.length;i++){
           temp=arr[i];
           j=i;
           while(j>0&&arr[j-1]>temp){
               arr[j]=arr[j-1];
               j=j-1;
           }
           arr[j]=temp;
       }
       for(int a:arr){
           System.out.println(a+" ");
       }
    }
}
