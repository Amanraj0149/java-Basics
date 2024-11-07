import java.util.Scanner;
public class hcf{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       while(b!=0){
           int temp=b;
           b=a%b;
           a=temp;
       }
       System.out.println(a);
        sc.close();
    }
}

import java.util.Scanner;
public class hcf{
     public static int gcd(int a, int b){
            if(b==0) return a;
            return gcd(b,a%b);
        }
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       int ans=gcd(a,b);
       System.out.println(ans);
        sc.close();
    }
}
