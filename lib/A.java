package lib;

public class A {
  public static String getPublic() {
    return getPrivate();
  }

  private static String getPrivate() {
    return A3.getPublic();
  }
}
