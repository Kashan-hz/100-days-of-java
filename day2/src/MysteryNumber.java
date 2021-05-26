import java.util.Scanner;

public class MysteryNumber {

    static int rev(int x){
        String s = Integer.toString(x);
        String str="";
        for(int i=s.length()-1;i>=0;i--){
            str=str+s.charAt(i);
        }
        int rev= Integer.parseInt(str);
        return rev;
    }

    static boolean isMystery(int n){
        for(int i=1;i<=n/2;i++){
            int j= rev(i);
            if(i+j==n){
                System.out.println("It is a mystery number");
                System.out.println(i+" + "+j+" = "+n);
                return true;
            }
        }
        System.out.println("Not a Mystery number");
        return false;

    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num= sc.nextInt();
        isMystery(num);

    }

}
