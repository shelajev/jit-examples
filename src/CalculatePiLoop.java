public class CalculatePiLoop {

  public static volatile boolean warmUped = false;
  public static volatile double pi;

  public static void main(String[] args) {
    warmUp();

    int n = 100000;
    long time = -System.currentTimeMillis();
    pi = calculatePi(n);
    time += System.currentTimeMillis();
    System.out.println("WorkIt took " + (time) + " ms. pi = " + pi);
  }

  protected static void warmUp() {
    int w = 1000;
    long warmUpTime = -System.currentTimeMillis();
    pi = warmUp_0(w, w / 10);
    warmUpTime += System.currentTimeMillis();
    System.out.println("Warming up took " + (warmUpTime) + " ms. pi = " + pi);
  }

  private static double warmUp_0(int a, int b) {
    double s = 0;
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < b; j++) {
        s += calculatePi(100);
      }
    }
    warmUped = true;
    return s / (a * b);
  }

  private static double calculatePi(int n) {
    int c = 0;
    for (int i = 0; i < n; i++) {
      double a = Math.random();
      double b = Math.random();
      if (Math.hypot(a, b) < 1) {
        c++;
      }
    }
    return 4.0 * c / n;
  }
}
