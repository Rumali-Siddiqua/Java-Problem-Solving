import java.util.Scanner;
public class task7{
  
  public static char[] replaceLast(char ch1,char ch2){
    String name="CSE CSE";
    char [] array= name.toCharArray();
    for(int index=array.length-1;index>0;index--){
      if(array[index]==ch1){
        array[index]=ch2;
        break;
      }
      else{
         
      }
    }
      return array;       
    }
  public static void main(String args []){
    Scanner sc=new Scanner(System.in);
    char ch1='S';
    char ch2='e';
    System.out.println(replaceLast(ch1,ch2));
    sc.close();
  }
}