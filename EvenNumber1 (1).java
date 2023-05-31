// to find sum of all even numbers between 1 to n.
import java.util.Scanner;
public class EvenNumber1{
  public static void main(String args[]){
    EvenNumber n=new EvenNumber();
    n.evenNumber();
  }
}
class EvenNumber{
  public void evenNumber(){
    Scanner s=new Scanner(System.in);
    int n;
    System.out.println("enter a number");
    n=s.nextInt();
    int sum=0;
    int i=0;
    do{
      sum=sum+i;
      i=i+2;
    }
      while(i<=n);
    System.out.println("sum of even numbers is "+sum);
  }
}
