package IPL;
import java.util.ArrayList;
public class PlayersData {
	ArrayList<Player>  m1() {
	
		Player p1= new Player("Dhoni",30,2,"Kepper");
		Player p2= new Player("sachin",36,4,"Batter");
		Player p3= new Player("maxwell",34,79,"fildkkkkkkkkkkker");
		Player p4= new Player("rohit",38,57,"Batter");
		Player p5= new Player("dubey",37,6,"boller");
		Player p6= new Player("warner",32,8,"boller");
		Player p7= new Player("jadeja",35,5,"Batter");

	ArrayList<Player> al = new ArrayList<>();
	al.add(p1);
	al.add(p2);
	al.add(p3);
	al.add(p4);
	al.add(p5);
	al.add(p6);
	al.add(p7);
	
	ArrayList<Player> bt = new ArrayList<>(); 
	for (Player player : al) {
		if(player.getProfession()=="Batter") {
               bt.add(player);

		}

	}
	
	return bt;

}	
	
}
