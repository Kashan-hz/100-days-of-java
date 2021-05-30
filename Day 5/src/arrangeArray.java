public class arrangeArray {
    public static void main(String[] args){
        arrangeArray ob = new arrangeArray();
        int arr[]={1,2,3,-1,-2,-3};
        int n=arr.length;
        int pivot =0,i=-1;
        for(int j=0;j<n;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[j]=arr[i];
                arr[i]= temp;
            }
        }
        for(int x =0;x<n;x++){
            System.out.print(arr[x]+" ");
        }

    }
}
