import java.util.Scanner;
public class CountIntegersize{
  public static void main( String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int ans= String.valueOf(n).length();
    System.out.println(ans);
    sc.close();
  }
}
