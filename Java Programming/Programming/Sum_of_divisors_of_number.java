import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = sc.nextInt();
    int sum = sumDivisors(num);
    System.out.println("Sum of divisor of " + num + " is " + sum);
  }

  static int sumDivisors(int x){
    int sum = 0;
    for(int i=1 ; i*i <= x; i++){
      sum += i;
      if(x / i != i)
        sum += x/i;
    }
    return sum;
  }
}