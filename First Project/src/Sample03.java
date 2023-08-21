import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Sample03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        List<String> sam=new LinkedList<String>();
        sam.add("1");
        sam.add("4");
        sam.add("3");
        sam.add("5");
        
        sam.add(4,"4"); // we can only able to add not manuplate
        
        System.out.println(sam);
        sam.remove(0);
        sam.remove("4");
        System.out.println(sam.get(2));
        System.out.println(sam);
        
       sam.set(0,"6");
       System.out.println(sam);
       Collections.sort(sam);
       System.out.println(sam);
       
//       boolean contains();
       String arr[]= {"s","d","f"};
       
       ArrayList<String> kom=new ArrayList<String>(Arrays.asList(arr));
       
       
       
       
       LinkedList<String> dom=new LinkedList<String>(Arrays.asList(arr));
       System.out.println(dom);
       System.out.println(dom.get(0));
      
	}

}
