
import java.util.Scanner;


public class OneX {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int tem1=0;
            for(int j=0;j<(n*2)-1;j++){
                if(j>((n*2)-1)/2){
                    tem1--;
                }
                else{
                    tem1++;
                }
                System.out.print(tem1);

            }
            System.out.println();
    for(int i=n-1;i>0;i--){
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


    for(int i=2;i<n;i++){
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
    int tem3=0;
            for(int j=0;j<(n*2)-1;j++){
                if(j>((n*2)-1)/2){
                    tem3--;
                }
                else{
                    tem3++;
                }
                System.out.print(tem3);

            }
            System.out.println();
                
  }
}
