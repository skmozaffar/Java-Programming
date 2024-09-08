import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = sc.nextInt();
    if(isArmStrong(num))
      System.out.println(num + " is an Armstrong number");
    else
      System.out.println(num + " is not an Armstrong number");
  }

  static int countDigits(int x){
    int count = 0;
    do{
      x = x / 10;
      count++;
    }while(x > 0);
    return count;
  }

  static int power(int x, int n){
    int power = 1;
    for(int i = 1 ; i <= n ; i++){
      power = power * x;
    }
    return power;
  }
  
  static boolean isArmStrong(int n){
    int num = n;
    int sum = 0;
    while(n > 0){
      int ld = n % 10;
      int temp = power(ld, countDigits(num));
      sum += temp;
      n = n / 10;
    }
    return (sum == num);
  }
}