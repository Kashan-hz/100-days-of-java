import java.util.Scanner;

public class largestSmallest {
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of elements of array: ");
        int num = s.nextInt();
        int[] arr = new int[num];
        System.out.format("Enter %d numbers \n", num);
        for (int i = 0; i < num; i++) {
            arr[i] = s.nextInt();

        }
        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 0; i < num; i++) {
            if (arr[i] > largest) {
                largest = arr[i];

            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }


        }
        System.out.format("Largest number is %d \nSmallest number is %d ",largest,smallest);
    }

}
