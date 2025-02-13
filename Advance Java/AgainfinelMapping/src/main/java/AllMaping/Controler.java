package AllMaping;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Controler {
public static void main(String[] args) {
	Configuration cfg= new Configuration();
	cfg.configure();
	cfg.addAnnotatedClass(Address.class);
	cfg.addAnnotatedClass(Employee.class);
	SessionFactory sc = cfg.buildSessionFactory();
Session s = sc.openSession();
Address ad1 = new Address(1,"usa");    
Address ad2 = new Address(2,"usa2");        

Employee e1 =new  Employee(1,"Anup");

  ArrayList<Address>al =new ArrayList();
  al.add(ad1);
  al.add(ad2);

e1.setAid(al); //set in forain key 
 
 s.save(e1);
 Transaction t= s.beginTransaction();
 t.commit();

	
	
}
}
