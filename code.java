class Test{
    void myMethod(){
      System.out.println("InterviewBit");
    }
  }
  
  public class Derived extends Test{
    void myMethod(){
      System.out.println("IB");
    }
  
    public static void main(String[] args){
      Derived object = new Test();
      object.myMethod();
    }
  }