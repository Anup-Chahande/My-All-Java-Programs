package plant_care_app.Dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import plant_care_app.Entity.Plants;


@Repository

public class Dao {
	@Autowired
	SessionFactory sf;

	public List<Plants> getallPlantsdao() {
		List<Plants> alldata =null; 
		try(Session ss = sf.openSession()){
		Criteria c = ss.createCriteria(Plants.class);
		alldata = c.list();


	}
		catch(Exception e) {
			
		}
		return alldata;

	}

	public void Addplants(Plants plantdata) {

		try(Session ss = sf.openSession()){
		ss.save(plantdata);
		Transaction t = ss.beginTransaction();
		t.commit();

	}
	catch(Exception e) {
		
	}	
	}

	public List<Plants> getplantbyid(int pid) {
		List<Plants> ls=null;
		try(Session ss = sf.openSession()){
		Criteria c = ss.createCriteria(Plants.class);
		 
		ls = c.list();
		
		

	}
		catch(Exception e) {}
		return ls;

	}

	public void Updateplants(Plants plantupdatedata) {

		try(Session ss = sf.openSession()){
		ss.update(plantupdatedata);
		Transaction t = ss.beginTransaction();
		t.commit();
	}
	catch(Exception e) {}	
	}

	public void deleteplants(int id) {

		try(Session ss = sf.openSession()){
		Criteria c = ss.createCriteria(Plants.class);
		List<Plants> ls = c.list();
		for (Plants plants : ls) {

			if (plants.getPlant_id() == id) {
				Plants p = new Plants(id,plants.getPlant_Name(),plants.getPlant_Age(),plants.getRequirement(),plants.getPlant_Image());
				p= (Plants) ss.merge(p);
				
					ss.delete(p);
					Transaction t = ss.beginTransaction();
					t.commit();

			}
		}
		}
		catch(Exception e) {
        

	}
}
}