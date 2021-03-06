public class Stars {
  
  public static String mult(String s, int n) {
    String out = "";
    for (int i = 0; i < n; ++i) {
      out += s;
    }
    return out;
  }

  public static String tri(int s) {
    String out = "";
    s++;
    for (int i = 0; i < s; ++i) {
      out += rect(1, i);
    }
    return out;
  }

  public static String triback(int s) {
    String out = "";
    s++;
    for (int i = 0; i < s; ++i) {
      for (int j = 0; j < s - i - 1; ++j) {
        out += " ";
      }
      out += rect(1, i);
    }
    return out;
  }

  public static String triback2(int s) {
    String out = "";
    for (int i = 1; i < s + 1; ++i) {
      out += mult(" ", s - i) + mult("*", i) + "\n";
    }
    return out;
  }

  public static String tribackDown(int s) {
    String out = "";
    for (int i = 0; i < s; ++i) {
      out += mult(" ", i) + mult("*", s - i) + "\n";
    }
    return out;
  }

  public static String rect(int h, int w) {
    String out = "";
    int c1 = 0;
    int c2 = 0;
    while (c1 < h) {
      while (c2 < w) {
        out += "*";
        c2++;
      }
      out += "\n";
      c1++;
      c2 = 0;
    }
    return out;
  }

  public static String forRect(int h, int w) {
    String out = "";
    for (int i = 0; i < h; ++i) {
      for (int j = 0; j < w; ++j) {
        out += "*";
      }
      out += "\n";
    }
    return out;
  }

  public static void main(String[] args) {
    System.out.println(rect(2, 3));
    System.out.println(rect(1, 4));
    System.out.println(tri(8));
    System.out.println(triback2(5));
    System.err.println(tribackDown(5));
  }
}
