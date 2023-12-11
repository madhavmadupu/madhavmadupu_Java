package Week4;
public class OverLoading {
	void add(int a,int b)
	{
	System.out.println(a+b);
	}
	void add(int a,int b,int c)
	{
	System.out.println(a+b+c);
	}
	void add(int a,float b)
	{
	System.out.println(a+b);
	}

	public static void main(String[] args) {
		OverLoading mo=new OverLoading();
		mo.add(10,20);
		mo.add(10,20,30);
		mo.add(10,20.1f);
	}
}