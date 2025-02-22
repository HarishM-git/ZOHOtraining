public class ClassAndObjects {
  static class Harish{
    int sum=0;//instance variable where each object have different instance of this variable 
    int ad(){
      sum++;
      return sum;
    }
    
  }
  public static void main(String[] args) {
    Harish ob1=new Harish();
    Harish ob2=new Harish();

    ob1.ad();
    System.out.println(ob1.sum);//this will print 1 because the ad function is called in the above so this objects reference for the sum instance is incremented by 1 but only for this object only ok
    System.out.println(ob2.sum);//as you can see this will not print 1 because this object has seperate reference for the instace sum ok so this will definetely print 0

  }
}
