import java.util.*;
public class All_Palindrome {
  public static void main(String[]args){
    
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the string: ");
    String str=sc.nextLine();
  StringEx8 a = new  StringEx8 ();
  a.isPalindrome(str);
}
}
 class StringEx8 {
  public void isPalindrome(String str){
    String str1="";
    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
      str1=ch+str1;
    }
    System.out.println(str);
    System.out.println(str1);
    boolean bool=str1.equals(str);
    if(bool)
     
       System.out.println("string is a palindrome ");
    else
       System.out.println("string is a not a palindrome ");
      
    
   }
  }