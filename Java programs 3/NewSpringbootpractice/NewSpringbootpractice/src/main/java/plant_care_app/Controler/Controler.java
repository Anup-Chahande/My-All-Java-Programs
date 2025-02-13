package plant_care_app.Controler;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import plant_care_app.Entity.Plants;
import plant_care_app.Service.Services;


@RestController
@CrossOrigin("http://localhost:4200/")
public class Controler {

	@Autowired
	Services s;

	@GetMapping("/plants")
	public List<Plants> getallPlantscontroler() {

		return s.getallPlantssserviece();

	}

	@GetMapping("/plants/{pid}")
	public Plants getplantbyid(@PathVariable int pid) {
		return s.getplantbyid(pid);

	};

	@PostMapping("/plants")

	public ResponseEntity<String> Addplants(@RequestBody Plants plantdata) {

		try {
	        s.Addplants(plantdata);  // The service handles image saving
	        return ResponseEntity.ok("Plant added successfully!");
	    } catch (Exception e) {
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
	                .body("Error adding plant: " + e.getMessage());
	    }
	}
	
	@PutMapping("/plants")
	public void Updateplants(@RequestBody Plants plantupdatedata) {
		
		
		s.Updateplants(plantupdatedata);
	}
	
	@DeleteMapping("/plants/{id}")
	public void deleteplants(@PathVariable int id) {
		
		s.deleteplants(id);
		
		
	
		
	}
	
	

}
