// Java program to find unique elements of the array // array elements 1,2,3,4,2,2,4,4 // unique elements are 1,3
import java.util.Scanner;
public class ArrayOfUniqueElements{
  public static void main(String[]args){
    Array a=new Array();
    a.array();
    
  }
}
class Array{
  public void array(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the total number of elements");
    int size=sc.nextInt();
    int arr[]=new int[size];
    System.out.println("Enter the array elements");
    for(int i=0;i<size;i++)
      arr[i]=sc.nextInt();
    int count;
    boolean visited[]=new boolean[size];
    for(int i=0;i<size;i++){
      if(visited[i]==true)
        continue;
      count=1;
      for(int j=i+1;j<size;j++){
        if(arr[i]==arr[j]){
          count=count+1;
          visited[j]=true;
        }
      }
      if(count==1)
         System.out.println("unique elements"+arr[i]);

    }
  }
}


    