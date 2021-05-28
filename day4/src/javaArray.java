import java.util.Scanner;

public class javaArray {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] arr= new int[5];
        for(int i=0;i<arr.length;i++){
            System.out.format("Enter value of z[%d]",i);
            arr[i]=s.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.format("The value of z[%d] is %d \n",i,arr[i]);

        }

    }
}
