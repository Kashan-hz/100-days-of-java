import java.util.Scanner;

public class max_min_diff {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of Element of your Array");
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        int large = arr[n-1];
        int small = arr[0];
        int small2 = arr[1];

        int maxDiff=large-small;
        int minDiff= small2-small;
        System.out.format("MAX DIFFERENCE IS %d \nMIN DIFFERENCE IS %d",maxDiff,minDiff);



    }
}
