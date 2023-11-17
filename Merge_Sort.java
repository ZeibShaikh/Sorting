public class Merge_Sort {
    public static void main(String[] args) {
        int [] a={3,277,1,457,24,21};
        int temp,min;
        for(int i=0;i<a.length;i++){
            min=i;
            for(int j=i+1;j< a.length;j++){
                if(a[j]<a[min]){
                  min=j;
                }

            }
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        for(int i:a){
            System.out.println(i+" ");
        }
    }
}
