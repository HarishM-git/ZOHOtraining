import java.util.Scanner;

public class lastDigit {
  public static void main(String[] args) {
    Scanner h=new Scanner(System.in);
    int i=h.nextInt();
    if (i<0){
      System.err.println(i%10*-1);
    }
    else{
      System.out.println(i%10);
    }
  }
}
