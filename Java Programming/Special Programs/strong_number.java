class Main {
  /// Q - check whether the number is strong number or not 
  
    int num = 145;
    int num1 = num;
    int sum=0;
    int ld;
    while(num>0){
      ld=num%10;
      int fact=1;
      for(int i=ld;i>0;i--){
        fact *= i;
      }
        sum += fact;
        num=num/10;
    }
    if(sum==num1){
      System.out.println("It is strong number");
    }
    else{
      System.out.println("It is not strong number");
    }
  }
}