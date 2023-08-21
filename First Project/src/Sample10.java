import java.util.*;
class ramp
{
	int a,b,c;
	ramp()
	{
		a=30;
		b=40;
		
		
	}
	
	int jump(int a,int b)
	
	{
		c=a+b;
		return c;
		
	}
	
}
public class Sample10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ramp r=new ramp();
		//r.jump(20, 30);
		System.out.println(r.jump(20, 30));
		
		

	}

}
