import java.util.Scanner;

public class arrayStarting {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int size=sc.nextInt();
        int[] arr={1,2,3,4}; 
        int[] data=new int[5];//array with size declaration
        int e=0,oo=0;
        for (int i=0;i<data.length;i++ ){
            data[i]=sc.nextInt();
        } 
        // System.out.println(data);
        for (int o=0;o<data.length;o++){
            if (o%2==0){
                e+=data[o];
            }
            else{
                oo+=data[o];
            }
        }
        System.out.println(e-oo);

        

        
    }
}
