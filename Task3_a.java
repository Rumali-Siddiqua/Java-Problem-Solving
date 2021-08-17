import java.util.Scanner;
public class Task3_a{
  public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter word");
   String s=sc.nextLine();
   System.out.println(s.length());
   for(int i=0;i<s.length();i++){
     char ch=s.charAt(i);
     
     System.out.println(ch+":"+s.codePointAt(i));
   }

  }
}