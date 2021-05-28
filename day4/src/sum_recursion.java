import java.util.Scanner;

public class sum_recursion {
    public static int sum(int num){
        if((num/10)==0){
            return num;
        }
        else{
            return sum(num/10)+(num%10);
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int x;
        System.out.println("Enter a number to get sum of digit");

        x = s.nextInt();
        System.out.format("SUM OF DIGITS %d ",sum(x));
    }
}
