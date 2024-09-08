import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the year: ");
    int year = sc.nextInt();
    if(isLeap(year))
      System.out.println(year + " is a leap year");
    else
      System.out.println(year + " is not a leap year");
  }

  static boolean isLeap(int y){
    if(y % 400 == 0 || (y % 4 == 0 && y % 100 != 100 )){
      return true;
    }
    else{
      return false;
    }
  }
}