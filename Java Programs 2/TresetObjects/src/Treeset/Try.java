package Treeset;

import java.util.TreeSet;

public class Try {
public static void main(String[] args) {
	Employee e1 = new Employee(1,"Anup");
	Employee e2 = new Employee(2,"Sagar");
	Employee e3 = new Employee(2,"Kiran");
TreeSet<Integer> em = new TreeSet<Integer>();
          em.add(1);
          em.add(5);
          em.add(3);
          em.add(6);


          for (Integer integer : em) {
		
        	  System.out.println(integer);
		}
          
}


}
