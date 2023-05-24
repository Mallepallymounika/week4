//java program to find first occurrence of a character in a given string.

import java.util.*;
public class FirstOccurrence  {
  public static void main(String[]args){
  StringEx4 ab = new  StringEx4 ();
  ab.count();
}
}
 class StringEx4 {
  public void count(){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the string: ");
    String str=sc.nextLine();
     System.out.println("enter the character: ");
    char character=sc.nextLine().charAt(0);
    
    int index=-1;
    
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)==character){
        index=i;
        break;
      }
    }
    if(index!=-1){
        System.out.println("first occurrence of"+character+"fount at index"+index);
    }
      else{
         System.out.println("character"+character+"not found in the string");
      }
        
      }
 }