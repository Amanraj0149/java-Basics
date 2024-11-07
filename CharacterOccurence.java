import java.util.Scanner;
public class CharacterOccurence{
  public static void main( String[] args){
   Scanner sc=new Scanner(System.in);
   String s= sc.nextLine();
   char c= sc.next().charAt(0);
   int count=0;
   for(char ch:s.toCharArray()){
       if(c==ch) count++;
   }
   System.out.println(count);
   sc.close();
}
}
