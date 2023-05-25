//program to count alphabets,digits,special characters in a string.
import java.util.*;
public class Example1 {
  public static void main(String[]args){
FindString a = new FindString ();
  a.count();
}
}
 class FindString{
  public void count(){
    
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the string: ");
    String str=sc.nextLine();

     int count1=0;
    int count2=0;
    int count3=0;
    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
      if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='z')){
        count1++;
      }
      else if(ch>='0'&& ch<='9'){
        count2++;
      }
      else{
        count3++;
        
      }
        
      }
        System.out.println("total alphabets:"+ count1);
        System.out.println("total digits:"+ count2);
        System.out.println("total special characters:"+ count3);
    }
  }
