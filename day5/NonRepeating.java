
import java.util.Scanner;

public class NonRepeating {
  
  public static void main(String[] args) {
    Scanner h=new Scanner(System.in);
    String s=h.next().toLowerCase();
    int[] r=new int [26];
    for(int i=0;i<s.length();i++){
      r[s.charAt(i)-'a']++;
    }
    int i=0;
    for(int j=0;j<s.length();j++){
      
        if(r[s.charAt(j)-'a']==1){
            System.out.println(s.charAt(j));
            break;
        }
      } 
    }
    
    

}

