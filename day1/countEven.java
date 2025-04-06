import java.util.Scanner;

public class countEven {
  public static void main(String[] args) {
    Scanner h=new Scanner(System.in);
    int cc=0;
    int a=h.nextInt();
    int b=h.nextInt();
    int c=h.nextInt();
    int d=h.nextInt();
    int e=h.nextInt();
    if (a%2==0){
      cc+=1;
    }
    if (b%2==0){
      cc+=1;
    }
    if (c%2==0){
      cc+=1;
    }
    if (d%2==0){
      cc+=1;
    }
    if (e%2==0){
      cc+=1;
      
    }
    System.err.println(cc);
    System.out.println("Program executed sucessfully!")

  }
}
