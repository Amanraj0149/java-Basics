import java.util.*;
public class ReverseStringin {
   public static void main(String[]args ){
    Scanner sc= new Scanner(System.in);
    String s= sc.nextLine();
    StringBuilder ans= new StringBuilder(s);
    ans.reverse();
    System.out.println(ans.toString());
   }

}
