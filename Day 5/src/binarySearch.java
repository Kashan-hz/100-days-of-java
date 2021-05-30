import java.util.Scanner;

public class binarySearch {
    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
    int search(int arr[],int l,int u,int x){

        if(u>=l){
            int mid = l+(u-1)/2;

            if(arr[mid] == x){
                return mid;

            }
            if(arr[mid]>x){
                return search(arr,l,mid-1,x);
            }
            return search(arr,mid+1,u,x);

        }
        return 0;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        binarySearch ob = new binarySearch();
        System.out.print("Enter size of Array: ");
        int n = s.nextInt();
        int arr[] =new int[n];
        System.out.format("Enter %d Elements of your array: ",n);
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        ob.bubbleSort(arr);
        System.out.print("Your Sorted array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        System.out.print("Enter the number you want to search: ");
        int x = s.nextInt();
        int result=ob.search(arr,0,n-1,x);
        if(result==0){
            System.out.println("not found");
        }
        else{
            System.out.format("Element is found at %dth index",result);
        }

    }
}
