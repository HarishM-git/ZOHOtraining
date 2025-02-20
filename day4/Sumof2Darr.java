import java.util.Scanner;

public class Sumof2Darr {
  public static void main(String[] args) {
    Scanner h=new Scanner(System.in);
    int s=h.nextInt();
    int[][] a1=new int[s][s];
    int[][] a2=new int[s][s];
    int[][] a3=new int[s][s];
    for (int i=0;i<s;i++){
      for (int j=0;j<s;j++){
        a1[i][j]=h.nextInt();
      }
    }
    for (int i=0;i<s;i++){
      for (int j=0;j<s;j++){
        a2[i][j]=h.nextInt();
      }
    }
    for (int i=0;i<s;i++){
      for (int j=0;j<s;j++){
        a3[i][j]=a1[i][j]+a2[i][j];
        System.err.print(a3[i][j]+" ");
      }
      System.out.println(" ");
    }
    
  }
  
}
