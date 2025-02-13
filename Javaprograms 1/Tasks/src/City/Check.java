package City;

import java.util.ArrayList;

import java.util.HashMap;

public class Check {

	void get1() {

		Vileges v = new Vileges();
		ArrayList<String> vilages = v.m1();

		States s = new States();
		ArrayList<String> States = s.m3();

		Country c = new Country();
		ArrayList<String> country = c.m4();

		HashMap<String, ArrayList<String>> State = new HashMap<>();
		State.put("States", States);
		HashMap<String, ArrayList<String>> vilage = new HashMap<>();
		vilage.put("Vilages", vilages);

		ArrayList<HashMap<String, ArrayList<String>>> ind = new ArrayList<>();

		for (String coun : country) {
			if (coun == "India")
				;
			ind.add(State);
			ind.add(vilage);
		}

		HashMap<String, ArrayList<HashMap<String, ArrayList<String>>>> hh = new HashMap();
		hh.put("India", ind);

		System.out.println(hh);

	}

	public static void main(String[] args) {
		Check c1 = new Check();
		c1.get1();
	}
}
