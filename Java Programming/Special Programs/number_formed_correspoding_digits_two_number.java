class Main {
  public static void main(String[] args) {
    int a=123;
    int b=456;
    int sum=0;
    int c=count(a);
    int ld1;
    int ld2;
    while(c>0){
      ld1=a%10;
      ld2=b%10;
      sum=sum+ld1*10+ld2;
      a=a/10;
      b=b/10;
      c--;
    }
    System.out.println(sum);
  }

  public static int count(int a){
    int count=0;
    while(a>0){
      a=a/10;
      count++;
    }
    return count;
  }
}