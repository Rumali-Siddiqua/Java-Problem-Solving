import java.util.Scanner;
public class task6{
  
  public static char[] replaceAll(char ch1,char ch2){
    String name="AMI BANgLAI gAAN gAI AMI BANgLAR gAAN gAI";
    char [] array= name.toCharArray();
    for(int index=0;index<array.length;index++){
      if(array[index]==ch1){
        array[index]=ch2;
      }
    }
      return array;       
    }
  public static void main(String args []){
    Scanner sc=new Scanner(System.in);
    char ch1='g';
    char ch2='G';
    System.out.println("Before edit : AMI BANgLAI gAAN gAI AMI BANgLAR gAAN gAI");
    System.out.print("After edit : ");
    System.out.println(replaceAll(ch1,ch2));
    sc.close();
  }
}