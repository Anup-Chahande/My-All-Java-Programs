package com.tka;

import java.util.ArrayList;

public class PlayerInfo {

	ArrayList<Player> playerInformation() {

		Player p1 = new Player("Dhoni", 7, 30, "india", "keeper");
		Player p2 = new Player("Yuvraj", 12, 34, "india", "batsman");
		Player p3 = new Player("Sachin", 10, 45, "Aus", "batsman");
		Player p4 = new Player("pat", 72, 65, "pak", "bowler");
		Player p5 = new Player("virat", 37, 66, "Uk", "batsman");
		Player p6 = new Player("rohit", 22, 33, "india", "asdf");
		Player p7 = new Player("sdf", 234, 45, "dsfgh", "sdfghg");
		Player p8 = new Player("3245", 3245, 3245, "sdfgh", "dfhgjhg");
		Player p9 = new Player("ngbvc", 435, 23430, "jhg", "keekjhgper");

		ArrayList<Player> al = new ArrayList<>();
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		al.add(p5);
		al.add(p6);
		al.add(p7);
		al.add(p8);
		al.add(p9);
		
		return al;
	}
}
