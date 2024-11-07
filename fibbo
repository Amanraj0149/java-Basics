import java.util.Scanner;
public class fibbo{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the Fibonacci sequence: ");
       int n=sc.nextInt();
       int[] arr= new int[n];
       if(n>0) arr[0]=0;
       if(n>1) arr[1]=1;
       for(int i=2;i<n;i++){
           arr[i]=arr[i-1]+arr[i-2];
       }
       System.out.println("fibbonaci:");
       for(int num:arr){
        System.out.print(num+ " "); }
        sc.close();
    }
}
