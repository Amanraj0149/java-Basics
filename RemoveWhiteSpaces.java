import java.util.Scanner;
public class Removespace{
  public static void main( String[] args){
   Scanner sc=new Scanner(System.in);
   String s=sc.nextLine();
   String res=s.replaceAll("\\s", "");
   System.out.println(res);
   sc.close();
}
}
