public class Binary_Search {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};

        boolean flag=false;
        int start,end,mid;
        start=0;
        end=arr.length-1;
        int key=10;
            while(start<=end){
                mid=(start+end)/2;
                if(key==arr[mid]){
                    System.out.println("Element found at ");
                    flag=true;
                    break;
                }
                if(key>arr[mid]){
                    start=mid+1;
                }
                if(key<arr[mid]){
                    end=mid-1;
                }
            }

        if (flag == false) {
            System.out.println("Element is not present in the array");
        }
    }
}
