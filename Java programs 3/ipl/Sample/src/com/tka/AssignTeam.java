package com.tka;

import java.util.ArrayList;
import java.util.HashMap;

public class AssignTeam {

	void teanAssign() {
		TeamCreation t = new TeamCreation();
		HashMap<String, HashMap<String, ArrayList<Player>>> data = t.teamGenerate();
		
		
		
	}

	public static void main(String[] args) {
		AssignTeam a = new AssignTeam();
		a.teanAssign();
	}
}
