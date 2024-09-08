import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int num = sc.nextInt();
    int sum = sumOfNatural(num);
    System.out.println("Sum of first " + num + " natural number is " + sum);
  }

  static int sumOfNatural(int x){
    int sum = 0;
    while(x > 0){
      sum = sum + x;
      x--;
    }
    return sum;
  }
}