
import java.util.Scanner;


public class vowelRemoval {
  

  static boolean canprint(char x){
    char[] chare={'a','e','i','o','u','A','E','I','O','U'};
    for(int i=0;i<chare.length;i++){
      if(chare[i]==x){

        return false;
      }
      
    }
    return true;
  }
  public static void main(String[] args) {
    Scanner h=new Scanner(System.in);
    char[] ch=h.nextLine().toCharArray();
    for( char i:ch){
      if(canprint(i)){
        System.out.print(i);
      }
    }
  }
}
