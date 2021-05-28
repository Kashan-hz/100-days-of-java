import java.util.Scanner;
import java.lang.*;
public class splitingArray {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number of elements: ");
        int n= s.nextInt();
        int[] arr=new int[n];
        System.out.format("Enter %d  of elements ",n);
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.print("Enter the position from where you want to split: ");
        int spLen = s.nextInt();
        System.out.println("Your splitted array is: ");
        for(int i=0;i<spLen;i++){
            System.out.format("%d ",arr[i]);


        }
        System.out.println("");

        for(int i=spLen;i<n;i++){
            System.out.format("%d ",arr[i]);
        }


    }
}
