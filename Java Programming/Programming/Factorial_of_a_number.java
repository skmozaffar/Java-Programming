import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int num = sc.nextInt();
    int fact = getFact(num);
    System.out.println("Factorial of " + num + " is " + fact);
  }

  static int getFact(int x){
    int fact = 1;
    while(x > 1){
      fact = fact * x;
      x--;
    }
    return fact;
  }
}