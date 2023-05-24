//WAP to reverse the array the array elements through methods
import java.util.*;
public class Reverse_Array{
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
    int arr[]=new int[6];
      System.out.println("enter the array values");
  for(int i=0;i<arr.length;i++)
    arr[i]=sc.nextInt();
  Array a1=new Array();
    a1.reverse(arr);
    System.out.println("the array  elements after reversing are");
    for(int i=0;i<arr.length;i++)
      System.out.println(arr[i]);

}
}
class Array{
  public int[] reverse(int arr[])
  {
    int n=arr.length;
    int temp=0;
    for(int i=0;i<n/2;i++){
      temp=arr[i];
    arr[i]=arr[n-i-1];
    arr[n-i-1]=temp;

    }
    return arr;
  }
}