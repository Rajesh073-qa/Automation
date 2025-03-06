package Selenium;
class a1
{
	public a1()
	{
		System.out.println("1");
	}
}
class a2
{
	public a2()
	{
		System.out.println("2");
	}

{

	System.out.println("IIb");

}
{
	System.out.println("IIb2");
}
public class a3
{
	public void Sib()
	{
		System.out.println("Sib");
	}
}
public class a4
{
	public void sib1()
	{
		System.out.println("Sib2");
	}
}
public class Viva4 {
	

	public void main(String[] args) 
	{
    new a1();
    new a2();
    a3 a=new a3();
    a.Sib();
    a4 b=new a4();
    b.sib1();
    
    
	}

}}
