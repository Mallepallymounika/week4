import java.util.*;
public class Reverse_Word {
  public static void main(String[]args){
  StringRev sr = new  StringRev();
  sr.count();
}
}
 class StringRev  {
  public void count(){
      Scanner sc=new Scanner(System.in);
    System.out.println("enter the string: ");
    String str=sc.nextLine();
    String words[]=str.split(" ");
    for(int i=0;i<words.length;i++){
      String reverse=" ";
      String w =words[i];
      for(int j=w.length()-1;j>=0;j--)
        {
          reverse=reverse+w.charAt(j);
          
        }
      System.out.println(reverse);
    }
  }
 }