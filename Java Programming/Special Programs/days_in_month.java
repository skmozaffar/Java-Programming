import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int a=sc.nextInt();
    if(a>=1 && a<=12){
      if(a==2){
        System.out.println(28);
      }
      else if(a%2==1 && a<=7){
        System.out.println(31);
      }
      else if(a%2==0 && a>=8){
        System.out.println(31);
      }
      else{
        System.out.println(30);
      }
    }
  }
}