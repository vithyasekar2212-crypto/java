import java.util.Scanner;
class marks{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
      if (m>=90){
      System.out.println("a");
      }
      if (m>=75){
      System.out.println("b");
      }
      if (m>=60){
      System.out.println("c");
      }
      if (m>=40){
      System.out.println("d");
      }
      else{
      System.out.println("e");
      }
  }
}