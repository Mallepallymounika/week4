//WAP to find reverse of a string.
//java program for finding the index value of the string

import java.util.*;
public class ReverseOfString {
  public static void main(String[]args){
  StringEx1 ap = new  StringEx1 ();
  ap.count();
}
}
 class StringEx1  {
  public String count(){
      Scanner sc=new Scanner(System.in);
    System.out.println("enter the string: ");
    String str=sc.nextLine();
    for(int i=0;i<str.length();i++)
      {
        char ch=str.charAt(i);
       nstr =ch+nstr;
    }
    System.out.println("Reversed string:"+str1);
    
    }
  }
/*int arr[]=new int[6];
      System.out.println("enter the array values");
  for(int i=0;i<arr.length;i++)
    arr[i]=sc.nextInt();
  Array a1=new Array();
    a1.reverse(arr);
    System.out.println("the array  elements after reversing are");
    for(int i=0;i<arr.length;i++)
      System.out.println(arr[i]);

/*int n=arr.length;
    int temp=0;
    for(int i=0;i<n/2;i++){
      temp=arr[i];
    arr[i]=arr[n-i-1];
    arr[n-i-1]=temp;

    }
    return arr;
    System.out.println("reverse of  string:");
    for(int i=0;i<str.length();i++)
     System.out.println(str.charAt(i));
    */