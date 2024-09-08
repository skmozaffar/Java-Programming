class Main {
  public static void main(String[] args) {
    int[] arr={343,6,261,9,18};
    int count=0;
    for(int i=0;i<arr.length;i++){
      if(count(arr[i])==3){
        count++;
      }
    }
    System.out.println(count);
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