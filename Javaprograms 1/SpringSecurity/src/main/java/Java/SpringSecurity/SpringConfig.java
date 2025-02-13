package Java.SpringSecurity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SpringConfig {
	
	@Bean
	public PasswordEncoder storepass() {
		
		return new BCryptPasswordEncoder();
		
	}
	
	
	@Bean
	 public UserDetailsService createuser() {
      UserDetails admin =  User.builder()
    		  .username("sagar")
    		  .password(storepass().encode("1322"))
    		  .roles("ADMIN")
    		  .build();
		
      
      return new InMemoryUserDetailsManager(admin);
		
		
	}
	
	
	
	
	

}
