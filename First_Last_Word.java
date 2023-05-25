// write a java program to find the difference between number of characters of first word and last word in a string
import java.util.*;
public class First_Last_Word   {
  public static void main(String[]args){
  StringEx6 ab = new  StringEx6 ();
  ab.count();
}
}
 class StringEx6 {
  public void count(){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the string: ");
    String str=sc.nextLine();
  String[] word = str.split(" ");
    int x=word[0].length();
    int y=word[word.length-1].length();
    int diff=x-y;
    System.out.println("Difference between the charater in first and last word "+diff);
  }
 }