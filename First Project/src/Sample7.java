import java.util.*;
class detail
{
	  int age=10;                    //if  private variable Then to solve/ to only retrive this we have constructer
	 String name="anil";
	void talk()
	{
		System.out.println("hello "+name);
		System.out.println("your age is "+age);
	}
}
public class Sample7 {
	public static void main(String[] args) {
		detail d1=new detail();
		d1.talk();
		//System.out.println(d1.hashCode());
		detail d2= new detail();
		//System.out.println(d2.hashCode());
		d2.age=20;
		d2.name="kishor";
		d2.talk();
		
		
		 

	}

}