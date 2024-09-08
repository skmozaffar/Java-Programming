import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int num = sc.nextInt();
    int digit_1 = num/10;
    int digit_2 = num%10;
    int sum = digit_1 + digit_2 + digit_1 * digit_2;
    if(sum == num)
      System.out.println(num + " is a special nunber");
    else
      System.out.println(num + " is not a special nunber");
  }
}