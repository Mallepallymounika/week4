//WAP to count frequency of each character in a string
import java.util.*;
public class Frequency_String  {
  public static void main(String[]args){
  StringEx ab = new  StringEx ();
  ab.count();
}
}
 class StringEx  {
  public void count(){
    
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the string: ");
    String str=sc.nextLine();
    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
      int count;
      System.out.println("character    count");
      boolean visited[]=new boolean[str.length()];
      for(i=0;i<str.length();i++){
        if(visited[i]==true)
          continue;
          count=1;
        for(int j=i+1;j<str.length();j++){
          if (str.charAt(i)==str.charAt(j)){
            count=count+1;
            visited[j]=true;
          }
        }
        System.out.println(str.charAt(i)+"                "+count);
      }
    }
  }
 }