//java program for finding the index value of the string

import java.util.*;
public class String_Index {
  public static void main(String[]args){
  StringEx a = new  StringEx ();
  a.count();
}
}
 class StringEx  {
  public void count(){
    
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the string: ");
    String str=sc.nextLine();
    System.out.println("enter the character");
      
    char ch=sc.next().charAt(0);
    int index=str.indexOf(ch);
    if(index>=0)
    {   
      System.out.println("the index of the character are :"+index);
                 }
    else
    {
      System.out.println("there is no such type of character in the string");
      
    }
    
    }
  }
