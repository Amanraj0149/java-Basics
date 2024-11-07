import java.util.Scanner;
public class Removespace{
    public static boolean isPlaindrome(String str){
       int i=0;
   int j=str.length()-1;
   while(i<j){
       if(str.charAt(i)!=str.charAt(i)) return false;
       i++;
       j--;
   } 
   return true;
    }
  public static void main( String[] args){
   Scanner sc=new Scanner(System.in);
   String s=sc.nextLine();
   boolean ans=isPlaindrome(s);
   
   System.out.println(ans);
   sc.close();
}
}
