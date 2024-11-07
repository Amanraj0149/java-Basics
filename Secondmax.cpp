// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
public class Largest{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] arr= new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       int maxi= Integer.MIN_VALUE;
       int smaxi=Integer.MIN_VALUE;
       for(int i=0;i<n;i++){
           if(arr[i]>maxi){
               maxi=arr[i];
           }
       }
       for(int i=0;i<n;i++){
           if(arr[i]>smaxi && arr[i]!=maxi){
               smaxi=arr[i];
           }
       }
       System.out.println(maxi);
       System.out.println(smaxi);
       
    }
}
