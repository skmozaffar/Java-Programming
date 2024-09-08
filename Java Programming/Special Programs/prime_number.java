class Main {
  public static void prime(int a){
    for(int i=2;i<=a/2;i++){
      if(a%i==0){
      System.out.println("not prime");
      return;
      }
    }
      if(a==1){
        System.out.println("neither prime nor composite");
        return;
      }
      System.out.println("prime");
  }
  public static void main(String[] args)   {
    prime(6);
  }
}