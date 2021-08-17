import java.util.Scanner;
public class task8{
  public static char[] toLowerCase(){
  String name="NAVEED";
  char [] array=name.toCharArray();
  for(int count=0;count<array.length;count++){
    array[count]=(char)(array[count]+32);
  }
  return array;
  }
  
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println(toLowerCase());
    sc.close();
  }
}