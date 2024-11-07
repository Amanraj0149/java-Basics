import java.util.Scanner;
public class CountVowelConsonat{
    
    public static boolean isVowel(char ch){
       return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int vowel=0;
        int con=0;
        for(char x:s.toCharArray()){
            if(isVowel(x)) vowel++;
            else{
                con++;
            }
        }
        System.out.println("Noof vowels are:"+vowel+"No of Consonants:"+ con);
        sc.close();
    }
}
