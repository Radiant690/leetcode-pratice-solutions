class ShrinkStrings {

  public static String shrink(String str) {
    int count = 0;
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      count++;

      // we don't count whitespaces, we just copy them.
      if (!Character.isWhitespace(str.charAt(i))) {
        if ((i + 1) >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
          result.append(str.charAt(i)).append(count);

          count = 0;
        }
      } else {
        result.append(str.charAt(i));
        count = 0;
      }
    }

    return result.length() > str.length() ? str : result.toString();
  }

  public static void main(String[] args) {
    System.out.println(ShrinkStrings.shrink("abbb ddddddd e deded d"));
  }
}
