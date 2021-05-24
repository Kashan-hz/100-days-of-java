import java.util.Scanner;

public class swap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers you want to swap");
        int first=sc.nextInt(),second=sc.nextInt();
        System.out.println("Before Swap");
        System.out.println("First number = "+first);
        System.out.println("Second number = "+second);

        int temp = first;
        first = second;
        second = temp;

        System.out.println("Before Swap");
        System.out.println("First number = "+first);
        System.out.println("Second number = "+second);


    }
}
