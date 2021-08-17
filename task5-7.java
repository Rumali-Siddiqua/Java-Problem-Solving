import java.util.Scanner;
public class task5{
  
  public static char[] replaceFirst(char ch1,char ch2){
    String name="C S E";
    char [] array= name.toCharArray();
    for(int index=0;index<array.length;index++){
      if(array[index]==ch1){
        array[index]=ch2;
        break;
      }
    }
      return array;       
    }
  public static void main(String args []){
    Scanner sc=new Scanner(System.in);
    char ch1='E';
    char ch2=' ';
    System.out.println(replaceFirst(ch1,ch2));
    sc.close();
  }
}