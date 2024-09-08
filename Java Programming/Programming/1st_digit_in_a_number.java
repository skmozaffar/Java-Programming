class Main {
  /// Q - print 1st digit of a given number
  public static void main(String[] args) {
    int num=8625;
    int num1=num;
    int c=count(num1);
    int ld;
    while(num>0){
      ld=num%10;
      num=num/10;
      if(c==1){
        System.out.println(ld);
      }
      c--;
    }
    
  }
  public static int count(int a){
    int count = 0;
    while(a>0){
      a=a/10;
      count++;
    }
    return count;
  }
}