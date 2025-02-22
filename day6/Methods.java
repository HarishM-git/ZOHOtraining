
import java.util.Scanner;

public class Methods {
  Scanner h=new Scanner(System.in);

  //without return type and without parameter
  void harish(){
    int nu1=h.nextInt();
    int nu2=h.nextInt();
    System.out.println(nu1+nu2);
  }
  //without return type and with parameter 
  static String suresh(String s1,String s2){//here this s1 and s2 have different memorey address then the s1 and s2 called in the main method ok
    System.out.println(s1+" "+s2);
    if(true){
      return s1;//always the return statement inside a condition should not be the only one return that exits in the that function or method 
    }
    else{
      return s2;
    }
    
  }

  public static void main(String[] args) {
    Methods n=new Methods();//this object is created because the methods harish not static if its static then dont need to create this object to call the harish, because as you know that staitc are saved in unique memory location so for calling them dont need ojects 
    n.harish();
    String s1="Harish";
    String s2="Mohan";
    suresh(s1,s2);
  }
}
// Scanner sc=new Scanner(System.in);
// 	//without return Type and Without parameter
// 	void devesh() {
// 		int num1=sc.nextInt();
// 		int num2=sc.nextInt();
// 		System.out.println(num1+num2);
// 		return;
// 	}
	
// 	//without return Type and With parameter
// 	void aadhi(float num1,int num2) {
// 		System.out.println(num1*num2);
// 	}
	
// 	//with return Type and With parameter
// 	String pawan(String n1,String n2) {
// 		String st=n1.concat(" "+n2);
// 		return st;
// 	}
	
// 	//with return Type and Without parameter
// 	char[] rahul() {
// 		String st="Java";
// 		return st.toCharArray();
// 	}
// 	public static void main(String[] args) {
// 		NgpCollege n=new NgpCollege();
// 		n.devesh();
// 		n.aadhi(10,20);
// 		String res=n.pawan("Manakula", "Vinayagar");
// 		System.out.println(res);
// 		for(char c:n.rahul()) {
// 			System.out.println(c);
// 		}
// 	}