import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);

      for (int i = 1; i < 100; i++) {
            if (isPrime(i)) {
              System.out.print(i + " ");
            }
        }
  }

 public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}