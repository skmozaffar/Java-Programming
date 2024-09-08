import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = sc.nextInt();
    int count = countDivisors(num);
    System.out.println("Total number of divisor of " + num + " is " + count);
  }

  static int countDivisors(int x){
    int count = 0;
    for(int i=1 ; i*i <= x; i++){
      count++;
      if(x / i != i) count++;
    }
    return count;
  }
}