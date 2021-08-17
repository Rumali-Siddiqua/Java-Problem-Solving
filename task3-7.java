import java.util.Scanner;
public class task3{
  
  public static boolean startsWith(){
  String name="CSE";
  String naam="CSE";
  char [] array=name.toCharArray();
  char [] nextarray=naam.toCharArray();
  int count=0;
  if(array.length<=nextarray.length){
  for(count=0;count<nextarray.length;count++){
    if(array[count]!=nextarray[count]){
    return false;
    }
  }
  return true;
  }
  else{
  for(count=0;count<array.length;count++){
    if(array[count]!=nextarray[count]){
    return false;
    }
  }
  return true;
  }
  }
  public static void main(String args []){
  Scanner sc=new Scanner(System.in);
  System.out.println(startsWith());
  sc.close();
  }
}