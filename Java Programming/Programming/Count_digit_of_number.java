class Main {
  public static void main(String[] args) {
     /// Q - count total number of digits present in the given number 
    
    int num = 568;
    int number = num;
    int count = 0;
    while(num>0){
      num = num/10;
      count++;
    }
    System.out.println("Count of digits in "+number+ " is "+count);

    /// Q - Count of even and odd digits present in a given number 
    
    int num1 = 67363831;
    int number1 = num1;
    int ld;
    int evencount = 0;
    int oddcount = 0;
    while(num1>0){
      ld=num1%10;
      if(ld%2==0){
        evencount++;
      }
      else{
        oddcount++;
      }
      num1=num1/10;
    }  
    System.out.println("Count of even digits in " +number1+ " is " +evencount);
    System.out.println("Count of odd digits in " +number1+ " is " +oddcount);

    /// Q - count odd numbers present in a given number 
    
    int num2 = 59632;
    int number2=num2;
    int ld1;
    int countodd=0;
    while(num2>0){
      ld1 = num2%10;
      if(ld1%2!=0){
      countodd++;
      }
      num2=num2/10;
    }
    System.out.println("Count of odd digits in "+number2+" is "+countodd);
  }
}