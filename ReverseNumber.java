import java.util.Scanner;
public class Reverse{
    
   
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int reverse=0;
       while(n!=0){
           reverse=reverse*10+n%10;
           n=n/10;
       }
       System.out.println(reverse);
        sc.close();
    }
}

// import java.util.Scanner;
// public class Reverse{
    
   
//     public static void main (String[] args){
//         Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//          StringBuilder s= new StringBuilder(Integer.toString(n));
//          s.reverse();
//          int ans=Integer.parseInt(s.toString());
//        System.out.println(ans);
//         sc.close();
//     }
// }
