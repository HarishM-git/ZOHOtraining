import java.util.Scanner;

public class SumofSumofDigits {
  public static void main(String[] args) {
      Scanner h=new Scanner(System.in);
      int n=h.nextInt();
      String l=Integer.toString(n);
      int t=l.length();
      int s=0;
      while(t!=0){
        s=s+((n%10)*t);
        n=n/10;
        t--;
      }
      System.out.println(s);

  }
  
}
