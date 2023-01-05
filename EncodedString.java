public class EncodedString {
  private static int whitespaces_count = 0;

  public static char[] encodeWhitespaces(char[] str) {
    // count whitespaces
    for (char i : str) {
      if (Character.isWhitespace(i)) {
        whitespaces_count++;
      }
    }

    // creating new encoded array
    if (whitespaces_count > 0) {
      char[] encodedStr = new char[str.length + whitespaces_count * 2];

      // Populating the new char array
      int index = 0;
      for (char i : str) {
        if (Character.isWhitespace(i)) {
          encodedStr[index] = '0';
          encodedStr[index + 1] = '2';
          encodedStr[index + 2] = '%';
          index = index + 3;
        } else {
          encodedStr[index] = i;
          index++;
        }
      }
      return encodedStr;
    }
    return str;

  }

  public static void main(String[] args) {
    // ? Ecoding String
    char[] str = "This is the best example".toCharArray();
    char[] Result = EncodedString.encodeWhitespaces(str);
    System.out.println(Result);
  }
}

// ! Possible approach to solve
/*
 * We can solve this problem in three steps:
 * 1. We count the number of whitespaces in the given char[].
 * 2. Next, create a new char[] that's the size of the initial char[], str, plus
 * the
 * number of whitespaces multiplied by 2 (a single whitespace occupies one
 * element
 * in the given char[], while the %20 sequences will occupy three elements in
 * the
 * resulting char[]).
 * 3. Lastly, we loop the given char[] and create the resulting char[].
 */