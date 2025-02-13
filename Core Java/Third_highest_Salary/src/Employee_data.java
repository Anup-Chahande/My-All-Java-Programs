import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Employee_data {
public static void main(String[] args) {
	int max=0;
	ArrayList<Employeee1> al = new ArrayList<>();

	Employeee1 e1 = new Employeee1(1,"x",1000);
	Employeee1 e2 = new Employeee1(2,"y",2000);
	Employeee1 e3 = new Employeee1(3,"z",3000);
	Employeee1 e4 = new Employeee1(4,"s",4000);
	Employeee1 e5 = new Employeee1(5,"t",2000);

            al.add(e1);
            al.add(e2);
            al.add(e3);
            al.add(e4);
            al.add(e5);

            Collections.sort(al);
            
           for(int i =0;i<al.size();i++) {
               for(int j =i+1;j<al.size();j++) {
            	   
            		  
            		  
            		  
            	  }

        	   //System.out.println(al.get(i));
        	   
        	   
        	   
           }
           
            
            
            
            
for (Employeee1 employeee1 : al) {
System.err.println(employeee1);
for (Employeee1 employeee12 : al) {
	
	if(employeee1.salary>employeee12.salary) {

		max=employeee1.salary;	

		}
                      

	

}


    
    
   

System.out.println("Max salary is " + max);



}}}
