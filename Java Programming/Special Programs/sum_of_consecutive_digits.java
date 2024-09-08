class Main {
  public static void main(String[] args) {
    int num=123;
    int sum=sum(num);
    System.out.println(sum);
  }
  public static int sum(int a){
    int ld;
    int sum=0;
    while(a>10){
      ld=a%100;
      sum=sum+ld(ld);
      a=a/10;
    }
    return sum;
  }

  public static int ld(int a){
    int ld;
    int sum=0;
    while(a>0){
      ld=a%10;
      sum=sum+ld;
      a=a/10;
    }
    return sum;
  }
}