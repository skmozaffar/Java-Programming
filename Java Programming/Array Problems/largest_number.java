class Main {
  public static void main(String[] args) {
    int[]a={26, 48,12,56,37};
    int max=a[0];
    for(int i=0;i<a.length;i++){
      if(a[i]>max){
        max=a[i];
      }
    }
    System.out.println(max);
  }
}