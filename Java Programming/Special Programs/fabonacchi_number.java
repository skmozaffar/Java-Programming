class Main {
  public static void main(String[] args) {
    int term=10;
    int a=0;
    int b=1;
    int count=2;
    while(count<=term){
      int num=b;
      b=b+a;
      a=num;
      count++;
      System.out.println(b);
    }
  }
}