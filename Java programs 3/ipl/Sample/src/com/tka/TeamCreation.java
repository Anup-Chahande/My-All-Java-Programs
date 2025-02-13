package com.tka;

import java.util.ArrayList;
import java.util.HashMap;

public class TeamCreation {

	HashMap<String, HashMap<String, ArrayList<Player>>> teamGenerate() {
		PlayerInfo p = new PlayerInfo();
		ArrayList<Player> data = p.playerInformation();

		ArrayList<Player> csk = new ArrayList<>();
		ArrayList<Player> rcb = new ArrayList<>();
		ArrayList<Player> rr = new ArrayList<>();

		for (Player player : data) {
			if (player.getJno() == 7 || player.getJno() == 12 || player.getJno() == 10) {
				csk.add(player);
			} else if (player.getJno() == 72 || player.getJno() == 37 || player.getJno() == 22) {
				rcb.add(player);
			} else {
				rr.add(player);
			}
		}
		
		ArrayList<ArrayList<Player>> temp = new ArrayList<>();
		temp.add(csk);
		temp.add(rcb);
		temp.add(rr);
		
		HashMap<String, ArrayList<Player>> hm = new HashMap<>();
		hm.put("CSK", csk);
		hm.put("RCB", rcb);
		hm.put("RR", rr);
		
		
		HashMap<String, HashMap<String, ArrayList<Player>>> ipl = new HashMap<>();
		ipl.put("IPL", hm);
		
		System.out.println(ipl);
		return ipl;
	}

	
}
