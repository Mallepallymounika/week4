/*You are tasked with creating a program that validates a user's password based on a specific pattern. The pattern requires the password to meet the following criteria:
 
The password must be at least eight characters long.
The password must contain at least one uppercase letter.
The password must contain at least one lowercase letter.
The password must contain at least one digit.
The password must contain at least one special character from the set: !@#$%^&*()-_+=
*/
import java.util.*;
public class PassWord {
  public static void main(String[]args){     
  CheckPassword cp = new CheckPassword();
  cp.example();
}
}
 class CheckPassword  {
  public void example (){
    Scanner sc=new Scanner(System.in);
    char ch;
    System.out.println("enter the password");
    String p=sc.nextLine();
    boolean u_letter=false,l_letter=false,digit=false,spe_char=false;
    if((p.length())>=8){
      for(int i=0;i<p.length();i++){
        ch=p.charAt(i);
        if(ch>='A'&& ch<='z')
          u_letter=true;
        else if(ch>='a'&& ch<='z')
          l_letter=true;
        else if(ch>='0'&& ch<='9')
          digit=true;
        else{
          if(ch=='!'||ch=='@'||ch=='#'||ch=='$'||ch=='%'||ch=='^'||ch=='&'||ch=='*'||ch=='(' || ch==')'||ch=='_'||ch=='-'||ch=='='||ch=='+')
     spe_char=true;
          }
          
    }
    if(u_letter && l_letter && digit && spe_char)
      System.out.println("Its a valid password");
      else
      System.out.println("It is not a valid password");      
  }
 }