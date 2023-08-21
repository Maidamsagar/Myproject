
public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// strings
		
		String s=new String("sagar");
		String a=new String("sagar");
		/*if(s==a) // it will check the hash code
		{
		    System.out.println("both are same");
		}
		else
		{
			System.out.println("not same");
		}
		*/
		if(s.equals(a))
		{
			System.out.println("both are same");
			
		}else
		{
			System.out.println("no same");
		}
		
	}

}
