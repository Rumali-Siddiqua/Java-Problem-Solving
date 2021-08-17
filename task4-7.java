import java.util.Scanner;
public class task4{
  
  public static boolean endsWith(){
  String name="AEACSE";
  String naam="BEACSE";
  char [] array=name.toCharArray();
  char [] nextarray=naam.toCharArray();
  int count=0;
  if(array.length<=nextarray.length){
  for(count=nextarray.length-1;count>0;count--){
    if(array[count]!=nextarray[count]){
    return false;
    }
  }
  return true;
  }
  else{
  for(count=array.length-1;count>0;count--){
    if(array[count]!=nextarray[count]){
    return false;
    }
  }
  return true;
  }
  }
  public static void main(String args []){
  Scanner sc=new Scanner(System.in);
  System.out.println(endsWith());
  sc.close();
  }
}