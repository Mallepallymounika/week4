import java.util.*;
public class Array_Menu{
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of an array");
    int size = sc.nextInt();
     int arr[]=new int[size];
    System.out.print("enter the array elements");
  for(int i=0;i<size;i++){
    arr[i]=sc.nextInt();
  Array a1=new Array();
    a1.findsum(arr);
    do{
      System.out.println("------menu-----");
      System.out.println("1.find the sum od array elements");
      System.out.println("2.find max and min elements");
      System.out.println("3.reverse of elements");
      System.out.println("4.find prime  elements");
       System.out.println("enter the choice");
     int choice=input.nextInt();
      switch (choice)
      {
        case 1:
        int sum=findsum(arr);
        System.out.println("sum of the number");
        break;
        case 2: 
        int Max=findMax(arr);
        int Min=findMin(arr);
        System.out.println("max number: "+max);
         System.out.println("min number: "+min);
        break;
        case 3:
          reverseArray(array);
          System.out.println("reverse of elements");
        break;
        case 4:
          primeElements=findPrimeElements(array);
         System.out.println("prime of elements");
      }
      while(choice!=0);
    }
 }
   }
class Array{
  public void findsum(int arr[])
  {
    int sum=0;
    for(int i=0;i<size;i++);{
    sum=sum+arr[i];
    System.out.println("sum:"+sum);
    }
  }
    public void findmax(int arr[]){
       for(int i=1;i<size;i++){
         if(arr[i]>max){
          int max=array[i];
         }
         if(arr[i]<min){
         int  min=array[i];
         }
System.out.println("max element:"+max);
         System.out.println("min element:"+min);
       }
      
    }
   public int[]  reverseArray(int arr[]){
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
   public boolean isPrime(int arr[]){
    if(num<=1)
      return false;
    else{
      for(int j=2;j<num;j++)
        if(num%j==0)
          return false;
      return true;
    }
   }
    
  }
}
  