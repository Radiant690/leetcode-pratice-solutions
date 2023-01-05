import java.util.ArrayList;

public class ArrayList1 {
  public static void main(String[] args) {
    // Creating a arraylist
    ArrayList<Integer> list = new ArrayList<>();

    list.add(31);
    list.add(2);
    list.add(32);
    list.add(4);
    list.add(53);

    // for (int i = list.size() - 1; i >= 0; i--) {
    // System.out.println(list.get(i));
    // }

    // // * Find max in list
    // int max = Integer.MIN_VALUE;

    // for (int i : list) {
    // if (i > max) {
    // max = i;
    // }
    // }
    // System.out.println(max);
    // for (int i : list) {
    // max = Math.max(i, max);
    // }

    // System.out.println(max);
    // System.out.println(list);

    // // * Swap 2 numbers
    // int index1 = 2, index2 = 4;
    // int temp = list.get(index1);
    // list.set(index1, list.get(index2));
    // list.set(index2, temp);
    // System.out.println(list);

    // * 2d multi arraylist
    ArrayList<ArrayList<Integer>> list2d = new ArrayList<>();
  }
}
