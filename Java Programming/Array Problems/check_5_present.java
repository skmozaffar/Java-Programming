class Main {
  public static void number(int[]b){
    for(int i=0;i<b.length;i++){
      if(b[i]==5){
        System.out.println("present");
        return;
      }
    }
    System.out.println("not present");
  }
  public static void main(String[] args) {
    int[] a = {1,2,3,4};
    number(a);
  }
}