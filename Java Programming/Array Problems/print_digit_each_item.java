class Main {
  public static void main(String[] args) {
    int[] a={34,678,9876,456};
    for(int i=0;i<a.length;i++){
      int count=count(a[i]);
      System.out.println("count of digit of "+a[i]+ " is "+count);
    }
  }
  public static int count(int a){
    int count=0;
    while(a>0){
      a=a/10;
      count ++;
    }
    return count;
  }
}