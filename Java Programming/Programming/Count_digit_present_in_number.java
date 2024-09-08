class Main {
  /// Q - design a method to prints count of digits present in a given number

  public static void countDigit(int a){
    int count = 0;
    int num = a;
    while(a > 0){
      a = a/10;
      count++;
    }
    System.out.println("Count of digits in "+num+" is "+count);
  }
 
  public static void main(String[] args) {
   countDigit(1961);
  }
}