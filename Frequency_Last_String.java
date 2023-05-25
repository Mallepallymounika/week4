//write a java program to find the frequency of characters of last word of a string
import java.util.*;
public class Frequency_Last_String{
  public static void main(String[]args){
  StringEx7 ab = new  StringEx7 ();
  ab.count();
}
}
 class StringEx7 {
  public void count(){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the string: ");
    String str=sc.nextLine();
    String[] word = str.split(" ");
    
    String y=word[word.length-1];
    
     for(int i=0;i<y.length();i++){
      char ch=y.charAt(i);
      int count;
      System.out.println("character    count");
      boolean visited[]=new boolean[y.length()];
      for(i=0;i<y.length();i++){
        if(visited[i]==true)
          continue;
          count=1;
        for(int j=i+1;j<y.length();j++){
          char ch1=y.charAt(j);
          
          
          if (y.charAt(i)==y.charAt(j)){
            count=count+1;
            visited[j]=true;
          }
        }
        System.out.println(y.charAt(i)+"                "+count);
      }
    }
  
  }
 }