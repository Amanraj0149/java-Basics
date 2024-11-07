import java.util.Scanner;
public class factorial{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the value of n:");
       int n=sc.nextInt();
       int product=1;
       for(int i=1;i<=n;i++){
           product*=i;
       }
       System.out.println(product);
    }
}
