import java.util.Scanner;
public class Task2{
  
  public static  char charAt(){
    String name="MOHAMMAD NAVEED HOSSAIN";
    char [] array=name.toCharArray();
    int count=9;
    if(count>=0 && count<=array.length-1){
      return array[count];
    }
    else{
    return '\0';
    }
  }
  public static void main(String args []){
    Scanner sc=new Scanner(System.in);
    System.out.println(charAt());
    sc.close();
  }
}