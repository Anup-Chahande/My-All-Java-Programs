package Super20Spring.Super20Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("Super20Spring")
@EntityScan("Super20Spring")
public class Super20SpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(Super20SpringApplication.class, args);
	}

}
