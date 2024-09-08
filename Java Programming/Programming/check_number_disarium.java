import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = sc.nextInt();
    if(isDisarium(num))
      System.out.println(num + " is a Disarium number");
    else
      System.out.println(num + " is not a Disarium number");
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
  
  static boolean isDisarium(int n){
    int num = n;
    int sum = 0;
    int c = countDigits(n);
    while(n > 0){
      int ld = n % 10;
      int temp = power(ld, c);
      sum += temp;
      n = n / 10;
      c--;
    }
    return (sum == num);
  }
}