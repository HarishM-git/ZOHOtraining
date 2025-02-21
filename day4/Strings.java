
import java.util.Scanner;

public class Strings {
  public static void main(String[] args) {
    Scanner h=new Scanner(System.in);
    int num=12345;
    //to convert stirng to integer
    String numString=String.valueOf(num);
    System.out.print(numString.charAt(3));
    String name=h.nextLine().toUpperCase();
    int len=name.length();
    //to split the stirng to a small small words
    String sen="Harish is a worlds best developer , he is once in a generation genius";
    String[] arr=sen.split(" ");
    for (String i:arr){
      System.out.println(i);
    }
  }
  
}
