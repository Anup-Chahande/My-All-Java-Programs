package Methods;
import java.util.HashMap;
public class HashMap {
	public static void main(String[] args) {
		HashMap<String,String> hs = new HashMap<>();
		hs.put("city", "pune");
		hs.put("Marks", "45");
		hs.put("name", "john");
		for(Map.Entry<String,String> h : hs.entrySet()){
	System.out.println(h.getKey() +" "+ h.getValue());

	//for(String key: hs.keySet()) {
	//	
//		System.out.println(key+"  =  "+hs.get(key));
	//}
		}

	}
}
