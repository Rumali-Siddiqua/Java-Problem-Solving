import java.util.Scanner;
public class task1{
  
  public static int length(){
    int [] array=new int[10];
    return array.length;
  }
  public static void main(String []argsa){
    Scanner sc=new Scanner(System.in);
    System.out.println(length());      
    sc.close();
  }
  
}