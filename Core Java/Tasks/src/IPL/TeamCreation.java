package IPL;

import java.util.ArrayList;
import java.util.HashMap;
public class TeamCreation {
               
	HashMap<String,HashMap<String,ArrayList<Player>>> teamCreation() {
		PlayersData p = new PlayersData();
		ArrayList<Player> data = p.m1();
		ArrayList<Player> csk= new ArrayList<>();
		ArrayList<Player> rcb= new ArrayList<>();
		ArrayList<Player> rr= new ArrayList<>();

		for (Player sl : data) {
		if(sl.getJno()==2 || sl.getJno()==5 || sl.getJno()==6) {
			csk.add(sl);
			}
			else if(sl.getJno()==4 || sl.getJno()==57) {
				
				rcb.add(sl);
			}
			else {
				rr.add(sl);
			}
		
		
	
	
		

	
		
	}
		ArrayList<ArrayList<Player>> aa = new ArrayList<>();
		aa.add(csk);
		aa.add(rcb);
		aa.add(rr);
		
		
		HashMap<String,ArrayList<Player>> hs = new HashMap();
hs.put("CSK", csk);
hs.put("RCB", rcb);
hs.put("RR",rr);

HashMap<String,HashMap<String,ArrayList<Player>>> hm = new HashMap();
         hm.put("IPL", hs);

return hm;
}
}
