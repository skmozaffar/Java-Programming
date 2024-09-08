class Main {
public static void main(String[] args)
	{
		int num=56789;
		int sum=sum(num);
		System.out.println(sum);
	}
	public static int sum(int n)
	{
		int ld;
		int sum=0;
		while(n>10)
		{
			ld=n%100;
			sum=sum+ld;
			n=n/10;
		}
		return sum;
	}
	/*public static int ld(int n)
	{
		int ld;
		int sum=0;
		while(n>0)
		{
			ld=n%10;
			sum=sum+ld;
			n=n/10;
		}
		return sum;
	}*/

    /*int a=1253;
    int sum=0;
    while(a>10){
      int ld=a%100;
      sum=sum+ld;
      a=a/10;
    }
    System.out.println(sum);
  }*/
}