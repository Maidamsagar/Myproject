import java.util.*;
class web
{
	int x;
	int y;
	web()
	{
		 x=30;
		 y=20;
	}
	
static	int demo(int a,int b)
	{
		int sum =a+b;
		return sum;
		
	}
void gum()
{
   int c=x+y;	
   System.out.println(c);
}
}
public class Sample9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		web b=new web();
		//b.demo(30, 30);
		b.gum();
		
		System.out.println(b.demo(30, 30));
		System.out.println(web.demo(3, 9));

	}

}
