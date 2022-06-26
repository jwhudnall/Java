import java.awt.*;
import java.util.Arrays;

public class DataTypes
{
  public static void main(String[] args)
  {
    // Point = Reference type
    Point point1 = new Point(1, 1);
    Point point2 = point1;
    point2.x = -3;
    System.out.println(point2.x);

    String message = "Hello, World.";
    System.out.println(message.startsWith("He"));
    message = message.replace(",", ";");
    System.out.println(message);

    // Arrays
    int[] numbers = new int[5];
    int[] nums2 = { 2, 4, 6, 8, 10 };
    System.out.println(Arrays.toString(numbers)); // Arrays is a Java class
    System.out.println("Length of nums2: " + nums2.length);

    // Multi Dimensional Array.
    int[][] nums3 = new int[2][3]; // 2 rows, 3 columns
    nums3[0][0] = 1;
    System.out.println(nums3[0][1]);
  }
}