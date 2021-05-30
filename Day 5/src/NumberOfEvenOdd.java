import java.util.Scanner;

public class NumberOfEvenOdd {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]=s.nextInt();

        }
        int e=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                e++;
            }

        }
        System.out.format("Number of Even numbers is %d \nNumber of Odd numbers is %d ",e,n-e);

    }
}
