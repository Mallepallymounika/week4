//You are working on a stock market analysis tool that helps investors analyze historical stock prices. This tool allows users to input an array of stock prices for a specific stock and identifies the minimum and maximum prices to help users make informed investment decisions.You are tasked with writing a java program in Java to accomplish this.
 
import java.util.*;
public class Stock_Market {
  public static void main(String[]args){     
  Stock_Market1 te = new Stock_Market1 ();
  
  te.Stock1();
}
}
 class Stock_Market1  {
  public void Stock1(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the stock prices");
    int numPrices=sc.nextInt();
    double[] Prices=new double[numPrices];
    for(int i=0;i<numPrices;i++){
      System.out.print("enter the stock price for the day"+(i+1)+":");
    
      
    }
    double minPrices=Prices[0];
     double maxPrices=Prices[0];
    for(int i=1;i<numPrices;i++){
      if(Prices[i]<minPrices){
        minPrices=Prices[i];
      }
      if(Prices[i]>minPrices){
        maxPrices=Prices[i];
      }
    }
    System.out.println("minimum price"+minPrices);
    System.out.println("maximum price"+maxPrices);
  }
 }