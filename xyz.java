class abc
{
	 abc(int x,int y)
	{
	  System.out.println("Sum Is:"+(x+y));
	}
	abc(int x)
	{
		System.out.println("Digit:"+(x));
	}
}
class pqr 
{
	 pqr(int x,int y)
	{
	 System.out.println("Sub Is:"+(x-y));
	}
}
class xyz
{
	public static void main(String args[])
	{
	abc f=new abc(10,20);
	pqr g=new pqr(20,10); 
	abc f1=new abc(10);
	}
}