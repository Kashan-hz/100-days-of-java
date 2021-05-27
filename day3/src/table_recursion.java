import java.util.Scanner;

public class table_recursion {
    public static void table(int x,int y ){
        if(y!=1){
            table(x,y-1);
        }
        System.out.println(x*y);
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number to get table:");
        int num = s.nextInt();
        table(num,10);

    }
}
