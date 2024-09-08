import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n = sc.nextInt();
    int avg = average(n);
    System.out.println("Average of first " + n + " numbers is " + avg);
  }

  static int average(int n){
    int sum = 0;
    for(int i = 1 ; i <= n ; i++){
      sum += i;
    }
    int avg = sum / n;
    return avg;
  }
}