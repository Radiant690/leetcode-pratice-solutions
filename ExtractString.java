package Github_To_Be_Uploaded_Java_Files;

import java.util.ArrayList;
import java.util.List;

public class ExtractString {
  public static List<Integer> extract(String str) {
    List<Integer> result = new ArrayList<>();

    StringBuilder temp = new StringBuilder(String.valueOf(Integer.MAX_VALUE).length());

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      // or, if (((int) ch) >= 48 && ((int) ch) <= 57)
      if (Character.isDigit(ch)) {
        temp.append(ch);
      } else {
        if (temp.length() > 0) {
          result.add(Integer.parseInt(temp.toString()));
          temp.delete(0, temp.length());
        }
      }
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(ExtractString.extract("cv dd 4k 2321 2 11 k4k2 66 4d"));

  }
}
