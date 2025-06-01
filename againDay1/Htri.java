
import java.util.Scanner;


public class Htri {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
        if(i==0){
            for(int j=0;j<n;j++){
              System.out.print("*");
            }
            System.out.println();
        }
        else{
            for(int j=1;j<=n-i;j++){
                if(j==1 || j==n-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
      
    }    
    
  }
}
