import java.util.Scanner;
public class palindrome{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s= sc.nextLine();
    StringBuilder rev=new StringBuilder(s) ;
    String revs=rev.reverse().toString();
    System.out.println(s.equals(revs));
    sc.close();
  }
}
