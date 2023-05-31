
public class Ex1{
  public static void main(String args[]){
    Example n=new Example();
    n.Example1();
  }
}
class Example {
  public void Example1(){
  
    StringBuffer sb=new StringBuffer("This is text");
    System.out.println(sb);
    sb.insert(9,"im mounika");
    System.out.println("after inserting"+sb);
    sb.append("from Hyd");
    System.out.println("after appending"+sb);
    int index=sb.indexOf("mounika");
    sb.replace(6,9,"mounika");
    System.out.println("after replacing:"+sb);
    sb.delete(index,7);
    System.out.println("after deleting:"+sb);
    sb.reverse();
    System.out.println("after reversing:"+sb);
    
  }
}
    