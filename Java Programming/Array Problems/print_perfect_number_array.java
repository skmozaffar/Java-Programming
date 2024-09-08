class Main {
  public static void main(String[] args) {
    int[] arr={3,6,21,9,18};
    for(int i=0;i<arr.length;i++){
      int original=arr[i];
      int c=1;
      int sum=0;
    while(c<arr[i]){ 
     if(arr[i]%c==0){
       sum=sum+c;
      }
      c++;
    }
    if(sum==original){
      System.out.println(arr[i]);
    }
   }
  }
}