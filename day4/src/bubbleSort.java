import java.util.*;

public class bubbleSort
{
    void sort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j = 0;j<n-i-1;j++){
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
    }
    void printArray(int arr[]){
        int n = arr.length;
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i]+"");

        }
        System.out.println("");
    }
    public static void main(String[] args)
    {
        bubbleSort ob = new bubbleSort();
        Scanner s= new Scanner(System.in);
        System.out.println("Enter number of element in a");
        int n= s.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        ob.sort(arr);
        ob.printArray(arr);
    }
}