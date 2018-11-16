public class Test {
  private int x = getitem(1);

  private static int getitem(int x ) {
    if(x==1) {
      System.out.println("doggos");
    }else if(x==2) {
      System.out.println("dogs");
    }
    return 0;
  }
  private static int y = getitem(2);//static field gets initalized called 1st.
  static {
    System.out.println("puppies");

  }
  int z = x;


  public static void main(String[] args) {
    System.out.println("puppers");
    new Test();
  }
}
