class Main {
  /// Q - print only even number in the range 10 to 20 without using any loop
  public static void range(int i){
    if(i>20){
      return;
    }
    if(i%2==0){
    System.out.println(i);
    }
    i++;
    range(i);
  }
  public static void main(String[] args) {
    range(10);
  }
}