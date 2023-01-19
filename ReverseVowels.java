/*Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.*/
import java.util.*;
public class ReverseVowels {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str = s.replaceAll("(?i)[^aeiou]", "");
        String str1="";
        for(int i=str.length()-1;i>=0;i--)
        {
            str1+=str.charAt(i);
        }
        String str2="";
        int j=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                str2+=str1.charAt(j);
                j++;
            }
            else {
                str2+=s.charAt(i);
            }
        }
        System.out.println(str2);
    }
}
