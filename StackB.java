import java.util.ArrayList;

public class StackB {

  static class Stack {
    // ? Implementation using ArrayList
    static ArrrayList<Integer> list = new ArrayList<>();

    // ! Function : isEmpty()
    public static boolean isEmpty() {
      return list.size() == 0;
    }

    // ! Function : push()
    public static void push(int data) {
      list.add(data);
      list.remove(list.size() - 1);
      return top;
    }

    // ! Function : pop()
    public static int pop() {
      int top = list.get(list.size() - 1);

    }

    // ! Function : peek()
    public static int peek() {
      return list.get(list.size() - 1);
    }
  }
}
