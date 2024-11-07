import java.util.Scanner;
import java.util.Arrays;;
public class Anagram{
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String c=sc.nextLine();
        char[] arr1=s.toCharArray();
        char[] arr2=c.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
      boolean isAnagram=Arrays.equals(arr1,arr2);
        System.out.println("Are the two strings anagrams? " + isAnagram);
        sc.close();
    }
}
