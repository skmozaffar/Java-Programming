class Main {
  public static void main(String[] args) {
    int[] a={2, 3,4,5,6};
    String [] b={"mozaffar","qayyum","noorsha"};
    int j=0;
    for(int i=0;i<a.length;i++){
        if(a[i]%2==0){
          System.out.println(b[j]);
          j++;
      }
    }
  }
}