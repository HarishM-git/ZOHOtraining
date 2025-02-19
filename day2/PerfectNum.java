import java.util.Scanner;
public class PerfectNum {
  public static void main(String[] args) {
    Scanner h=new Scanner(System.in);
    int y=h.nextInt();

    int s=0;
    
    for(int i=1;(i<=y/2);i++){
      if (y%i==0){
        s+=i;
        // System.out.println(i);

      }
    }
    System.out.println(s);
  }
}
