//java program to find all occurrence of a character in a given string.

import java.util.*;
public class All_Occurence {
  public static void main(String[]args){
  StringEx5 ab = new  StringEx5 ();
  ab.count();
}
}
 class StringEx5 {
  public void count(){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the string: ");
    String str=sc.nextLine();
     System.out.println("enter the character: ");
    char character=sc.nextLine().charAt(0);
     System.out.println("last Occurrence of character"  +character);

    
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)==character){
       System.out.println("Index:"+i);
      }
    }
      }
 }