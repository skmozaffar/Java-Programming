class Main {
  public static void main(String[] args) {
     /// Q - Sum of all digits present in a given number

    int num = 5736;
    int number = num;
    int ld;
    int sum =0;
    while(num>0){
      ld=num%10;
      sum += ld;
      num=num/10;
    }
    System.out.println("Sum of digits in "+number+ " is " +sum);

    /// Q - Sum of square of even digits present in a number

    int num1 = 86392;
    int number1 = num1;
    int ld1;
    int sumsquare = 0;
    while(num1>0){
      ld1 = num1%10;
      if(ld1%2==0){
        sumsquare += (ld1*ld1);
      }
      num1 = num1/10;
    }
    System.out.println("Sum of square of even digits of "+number1+ " is " +sumsquare);

    /// Q - Sum of even and odd digits present in a number

    int num2 = 693529;
    int number2 = num2;
    int ld2;
    int evensum = 0;
    int oddsum = 0;
    while(num2>0){
      ld2 = num2%10;
      if(ld2%2==0){
        evensum += ld2;
      }
      else{
        oddsum += ld2;
      }
      num2 = num2/10;
    }
    System.out.println("Sum of even digits of "+number2+ " is " +evensum);
    System.out.println("Sum of odd digits of "+number2+ " is " +oddsum);
  }
}