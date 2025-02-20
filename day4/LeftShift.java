import java.util.Scanner;
// left shift formula is (A * 2^B)

public class LeftShift {
  public static void main(String[] args) {
    Scanner h=new Scanner(System.in);
    int i=h.nextInt();
    int j=h.nextInt();//how many shift;
    System.out.println(i*Math.pow(2,j));

  }
}
