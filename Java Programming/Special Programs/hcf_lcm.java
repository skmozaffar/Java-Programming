class Main {
  public static void main(String[] args) {
    int a =12;
    int b =16;
    int c =8;
    int d =10;
    //int lcm=lcm(a, lcm(b, c));
    int hcf=hcf(a, hcf(b,hcf(c, d)));
    //System.out.println(lcm);
    System.out.println(hcf);
  }
  public static int lcm(int a, int b)     {
    int lcm=0;
    int p;
    int q;
    for(int i=1;i<=a;i++){
      if(a%i==0 && b%i==0){
        p=a/i;
        q=b/i;
        lcm=i*p*q;
      }
    }
    return lcm;
  }

  public static int hcf(int a, int b)     {
    int hcf=0;
    int p;
    int q;
    for(int i=1;i<=a;i++){
      if(a%i==0 && b%i==0){
        p=a/i;
        q=b/i;
        hcf=i;
      }
    }
    return hcf;
  }
}