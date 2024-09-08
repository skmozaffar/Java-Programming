class Main {
  public static void main(String[] args) {
    int[] arr={3,6,21,9,18};
    for(int i=0;i<arr.length;i++){
      if(isPerfect(arr[i])){
        System.out.println(arr[i]);
      }
    }
  }
  public static boolean isPerfect(int a){
    int original=a;
    int i=1;
    int sum=0;
    while(i<a){ 
     if(a%i==0){
       sum=sum+i;
      }
      i++;
    }
    return sum==original;
  }
}