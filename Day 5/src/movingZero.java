import java.util.Scanner;

public class movingZero {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int sz = s.nextInt();
        System.out.print("Enter your Array: ");
        int[] arr = new int[sz];
        for(int i=0;i<sz;i++){
            arr[i]=s.nextInt();
        }
        int count=0;
        for(int i=0;i<sz;i++){
            if(arr[i]!=0){
                arr[count++]=arr[i];

            }
        }
        while(count<sz){
            arr[count++]=0;
        }
        System.out.println("Your zeros are shifted to right: ");
        for(int i=0;i<sz;i++){
            System.out.format("%d ",arr[i]);
        }
    }
}
