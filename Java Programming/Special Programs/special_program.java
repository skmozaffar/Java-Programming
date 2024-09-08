import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    add();
  }
  public static void add(){
    Scanner sc=new Scanner(System.in);
         System.out.println("......Welcome!!.....");
System.out.println("Press 1 to add 2 number");
System.out.println("Press 2 to add 3 number");
    System.out.println("Press 3 to add 4 number");
    int a=sc.nextInt();
 if(a==1){
      System.out.println("Enter two numbers to be added");
    addition(sc.nextInt(),sc.nextInt());
  }

  if(a==2){
      System.out.println("Enter three numbers to be added");
addition(sc.nextInt(),sc.nextInt(),sc.nextInt());
  }

  if(a==3){
      System.out.println("Enter four numbers to be added");
  addition(sc.nextInt(),sc.nextInt(),sc.nextInt(), sc.nextInt());
  }
    one();
}
    public static void addition(int a, int b){
      Scanner sc=new Scanner(System.in);
      int sum=a+b;
      System.out.println(sum);
    }
  
    public static void addition(int a, int b, int c){
      Scanner sc=new Scanner(System.in);
      int sum=a+b+c;
      System.out.println(sum);
    }
  
    public static void addition(int a, int b, int c, int d){
      Scanner sc=new Scanner(System.in);
      int sum=a+b+c+d;
      System.out.println(sum);
    }


  public static void one(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Press 1 to continue");
    System.out.println("Press other any number to stop");
    int a=sc.nextInt();
    if(a==1){
      add();
    }
    else{
      System.out.println("....Thank You....");
    }
  }
}