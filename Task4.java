import java.util.Scanner;
public class Task4{
  public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   int[]array=new int[26];
   String name="BANGLADESH";
   for(int count=0;count<name.length();count++){
     char ch=name.charAt(count);
     int convertInInt=(int)ch;
     array[convertInInt-65]++;
     }
   for(int count=0;count<array.length;count++){
     System.out.println((char)(count+65)+"has been entered"+array[count]+"times");
   }
       
  }
}