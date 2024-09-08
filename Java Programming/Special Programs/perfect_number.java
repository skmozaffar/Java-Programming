class Main {
  public static void main(String[] args) {
     /// Q - Check whether the number is perfect number or not

    int num=6;
    int num1 = num;
    int i=1;
    int sum=0;
    while(i<num){
    if(num%i==0){
      sum += i;
    }
      i++;
  }
      if(sum==num1){
        System.out.println("The number " + num1 + " is a perfect number");
      }
      else{
        System.out.println("The number " +num1+ " is not a perfect number");
      }
    
  }
}