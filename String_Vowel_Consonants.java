import java.util.*;
public class String_Vowel_Consonants {
  public static void main(String[]args){
  vowelConsonats a = new vowelConsonats ();
  a.count();
}
}
 class   vowelConsonats {
  public void count(){
    
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the string: ");
    String input=sc.nextLine();
    scanner.close();

     int count1=0;
    int count2=0;
    for(int i=0;i<str.length();i++){
      char ch=str.chatAt(i);
      if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='z')){
        if ((ch=='a'||ch=='e'||ch=='i'||ch=='o'|
            ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'|
            ch=='U')){
          count1++;
            }
      }else{
        count2++;
      }
      
      }

        
      }
       
       System.out.println("number of vowels are"+ count1);
        System.out.println("numberof consonants are:"+ count2);
    }
  }
