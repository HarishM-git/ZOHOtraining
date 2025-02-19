import java.util.Scanner;
public class Prime {


  public static boolean harish(int y){

    for(int i=2;(i<=Math.sqrt(y));i++){
      if (y%i==0){
        return false;

      }

    }
    return true;
  }
  public static void main(String[] args) {
    Scanner h=new Scanner(System.in);
    int yy=h.nextInt();

    int s=0;
    
    

    for(int i=2;(i<=1000);i++){
      if (harish(i)){
        s+=1;
        if (s==yy){
          System.out.println(i);
          break;
        }
      }
    }

  }
}
