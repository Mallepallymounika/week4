
//java program printing maximum of three numbers
import java.util.Scanner;
public class Max {
public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the first number:");
  int num1=sc.nextInt();
  System.out.println("enter the second number:");
  int num2=sc.nextInt();
  System.out.println("enter the third number:");
  int num3=sc.nextInt();
   
       int max=num1;
        if(num2>max){
          max=num2;
          
        }
  if(num3>max){
    System.out.println("maximum"+num3);
    
  }
else {
  System.out.println("maximum"+max);
}
}
}