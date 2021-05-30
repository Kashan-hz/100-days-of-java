import java.util.Scanner;

public class kthMinMax {
    void sort(int[] arr){
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            for(int j=1;j<n-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }

    }
    public static void main(String[] args){
        kthMinMax ob = new kthMinMax();
        Scanner s =new Scanner(System.in);
        System.out.print("Enter Number of Element: ");
        int size= s.nextInt();
        int[] arr=new int[size];
        System.out.print("Enter your array: ");
        for(int i =0;i<size;i++){
            arr[i]=s.nextInt();
        }
        ob.sort(arr);
        System.out.print("Enter the value of k: ");
        int k = s.nextInt();
        int max,min;
        max=arr[size-k];
        min=arr[k-1];
        System.out.println("Max"+max+"\n"+"Min"+min);


    }
}
