
import java.util.Scanner;


public class NumPyr {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    // Boolean tem1=false;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n-i;j++){
        System.out.print(" ");
      }
      int tem2=0;

      for(int j=1;j<i*2;j++){
        if(j>i*2/2){
            tem2--;
        }
        else{
          tem2++;
        }
        if(j==1){
        System.out.print(tem2);

        }
        else if(j==i*2-1){
          System.out.print(tem2);
        }
        else{
            System.out.print(" ");
        }
      }
      System.out.println();
    } 
    
  }
}
