public class isPalindrome {
  public static void main(String[] args) {
    System.out.println(numIsPalindrome(-1221));
  }

  public static boolean numIsPalindrome(int number) {
    int absNum = Math.abs(number); // control for negative values
    String absNumStr = String.valueOf(absNum);
    String reversed = "";


    for (int i = absNumStr.length() - 1; i >= 0; i--) {
      char charNum = absNumStr.charAt(i);
      String charStr = Character.toString(charNum);
      reversed += charStr;
    }

    return Integer.parseInt(absNumStr) == Integer.parseInt(reversed);
  }

}