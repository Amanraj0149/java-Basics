import java.util.Scanner;
import java.util.HashSet;
public class RemoveDup{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashSet<Integer>st= new HashSet<>();
        for(int num:arr){
            st.add(num);
        }
        System.out.println(st);
        sc.close();
    }
}
