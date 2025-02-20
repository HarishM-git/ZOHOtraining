import java.util.Scanner;
public class Counter {
  public static void main(String[] args) {
    Scanner h=new Scanner(System.in);
    int s=h.nextInt();
    int d=0;
    int[] a=new int [10];
    while(s!=0){
      d=s%10;
      if(a[d]==0){
        System.out.println(d);
      }
      a[d]++;
      s=s/10;
      
    }
    

  }
}
