//Array of frequency of  elements
import java.util.Scanner;
public class ArrayOfFrequencyElements{
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
    System.out.println("elements\t\t count");
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
        System.out.println(arr[i]+"\t\t"+count);
      
      }
        
    
  }
}