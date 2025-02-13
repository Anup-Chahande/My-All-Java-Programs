package IPL;

import java.util.ArrayList;
import java.util.HashMap;

public class Assignteam {
void teaassign() {
	
	
	TeamCreation c= new TeamCreation();
	HashMap<String,HashMap<String,ArrayList<Player>>>  data = c.teamCreation();
	System.out.println(data);
	
	
}


public static void main(String[] args) {
	Assignteam as = new Assignteam();
	as.teaassign();
}
}
