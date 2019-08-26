package abc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mapper {

	public static void main(String[] args) {
		
		player p1=new player("dravid",40,12324.98);
		player p2=new player("dhoni",37,10000.98);
		player p3=new player("abhi",37,1044.98);
		  int c=0;
		ArrayList<player> al=new ArrayList<player>();
		HashMap<Integer,player> h1=new HashMap<Integer,player>();
		HashMap<Integer,player> h2=new HashMap<Integer,player>();
		HashMap<Integer,player> h3=new HashMap<Integer,player>();
		  al.add(p1);	
		  al.add(p2);	
		  al.add(p3);	
		  List<Map> list = new ArrayList();
		  list.add(h1);
		  list.add(h2);
		  list.add(h3);
		  for(Map k:list) {
			  list.get(0).put(1, k);
		  }
		
		for(player q:al) {
			  int key=q.age;
			 System.out.println("hgkhgjkgbjk"+ al.get(2));
			  switch(key) {
				  
			  case 37:
				  h1.put(key, q);
				  System.out.println(c++);
				 System.out.println(h1.entrySet());			  
			}
			  for(Map.Entry<Integer, player> abc:h1.entrySet()) {
				  System.out.println("Key = " + abc.getKey() + 
                          ", Value = " + abc.getValue());
			  }
	}

}
}
