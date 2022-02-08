package DAY7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String args[]) {
		Map<Integer,String> m = new HashMap<Integer,String>();
		m.put(1,"Amar");
		m.put(2,"Akhbar");
		m.put(3,"Anthony");
		
		Set s = m.entrySet();
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, String> e = (Map.Entry<Integer, String>) itr.next();
			System.out.println("Key---> "+e.getKey()+"   Value---> "+e.getValue());
		}
	}

}
