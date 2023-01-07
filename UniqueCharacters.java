import java.util.HashMap;
import java.util.Map;

class UniqueCharacters {
  // CONT
  private final static int MAX_CODE = 65535;

  public static boolean isUnique(String str) {

    // S.SB use Map and iterate by accessing with charAt()/ codepoint()
    Map<Character, Boolean> chars = new HashMap<>();

    // alt
    for (int i = 0; i < str.length(); i++) {
      // Edge case
      if (str.codePointAt(i) <= MAX_CODE) {
        // logic
        char ch = str.charAt(i);
        // Checking for whitespace
        if (!Character.isWhitespace(ch)) {
          //
          if (chars.put(ch, true) != null) {
            // vital result, if given
            return false;
          }
          // Mentionable activity : The following logic is specific to the unique character program
        } else {
          System.out.println("The given string contains unallowed characters");
          return false;
        }
      }
    }

    return true;

  }

  public static void main(String[] args) {
    // Unique Characters
    UniqueCharacters.isUnique("abs");
  }
}

// ! Solution
/*
 * Simple solution to this problem consists of using a Map<Character, Boolean>.
 * While we loop the characters of the given string via the charAt(int index)
 * method,
 * we try to put the character from index into this map and flip the
 * corresponding
 * boolean value from false to true. The Map#put(K k, V v) method returns
 * null if there was no mapping for the given key (character). If there is a
 * mapping for
 * the given key (character), then Map#put(K k, V v) returns the previous value
 * (in our case, true) associated with this key. So, when the returned value is
 * not null,
 * we can conclude that at least one character is duplicated, so we can say that
 * the given
 * string doesn't contain unique characters.
 */

// ! Typical concepts
/*
 * codePointAt() method for returning numeric value of unicode such that we come
 * to know the range of int applied like if outputted with 74, we can rest
 * assured that it is valid in the range of 0 - 652523
 * 
 */