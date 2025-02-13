package _2.Springmvc11.Project;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class Arraylistretu {

	public ArrayList<String> listofnames () {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Anup");
		al.add("sagar");
		al.add("Kiran");
		
		return al;
	} 
	
}
