import java.util.Scanner;

public class SearchInArray {
    public static int search(int arr[],int x){
        int n= arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter no of element in array");
        int n = s.nextInt();
        int[] arr=new int[n];
        System.out.format("Enter %d elements \n",n);
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Enter number you want to search");
        int x = s.nextInt();

        int result= search(arr,x);
        if(result==0){
            System.out.println("not present");

        }
        else{
            System.out.format("Element is present on %dth index\n",result);
        }
    }
}
