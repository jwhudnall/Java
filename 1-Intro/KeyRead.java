import java.lang.*;
import java.util.*;

class KeyRead
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int a,b,c;
    System.out.println("Enter 2 numbers: ");
    a = s.nextInt();
    b = s.nextInt();
    c = a + b;
    System.out.println("Sum is: " + c);
    // s.close();

    // Scanner n = new Scanner(System.in);
    String name;
    System.out.println("Enter your name: ");
    name = s.nextLine();
    System.out.println("Welcome, " + name);
    s.close();
  }
}