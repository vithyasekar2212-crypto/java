import java.util.Scanner;
public class example{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String name=sc.next();
    String dept=sc.next();
    String rollno=sc.next();
    System.out.println("welcome to java "+name);
    int a;
    a=sc.nextInt();
    System.out.println("Age is "+a);
    int e=sc.nextInt();
    int b=sc.nextInt();
    int c=e+b;
    int d=e-b;
    System.out.println("e+b "+c);
    System.out.println("e-b "+d);
  }
}