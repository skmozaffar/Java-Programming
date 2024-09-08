import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = sc.nextInt();
    if(isPrime(num))
      System.out.println("Number " + num + " is prime number");
    else{
      System.out.println("Number " + num + " is not a prime number");
    }
  }

  static boolean isPrime(int x){
    if(x == 1) return false;
    for(int i = 2 ; i < x/2 ; i++){
      if(x % i == 0) return false;
    }
    return true;
  }
}