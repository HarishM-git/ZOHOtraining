import java.util.Scanner;

public class Voting {
  public static void main(String[] args) {
    
    Scanner h=new Scanner(System.in);
    byte i=h.nextByte();
    if ((i>=18) && (i!=0)){
      System.err.println("YES YOU ARE ELIGIBLE");
  
    }
    else{
      System.err.println("NO SORRY YOU NEED TO BE 18 FOR VOTING");
    }
  }
}
