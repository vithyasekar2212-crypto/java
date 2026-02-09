import java.util.Scanner;
class charcheck{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    char ch=sc.next().charAt(0);
      if (ch>='A'&& ch<='Z'){
      System.out.println("upper case");
      }
      else if (ch>='a'&& ch<='z'){
      System.out.println("lower case");
      }
      else if (ch>='0'&& ch<='9'){
      System.out.println("digit");
      }
      else{
      System.out.println("special character");
      }
  }
}