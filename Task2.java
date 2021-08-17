import java.util.Scanner;
public class Task2{
  public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter word");
   String s=sc.nextLine();
   System.out.println(s.length());
   for(int i=0;i<s.length();i++){
     System.out.println(s.charAt(i));
   }
  }
}
    