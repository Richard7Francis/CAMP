package DAY8;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
	public static void main(String args[]) {
		ConcurrentHashMap<Integer,String> m = new ConcurrentHashMap<Integer,String>();
		
		m.put(1, "jerry");
		m.put(2, "oli");
		m.put(3, "nikki");
		m.put(4, "benny");
		m.putIfAbsent(3,"mynameadded");
		System.out.println(m);
	}
}
