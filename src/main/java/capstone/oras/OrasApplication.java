package capstone.oras;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(scanBasePackages = "capstone.oras")
public class OrasApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrasApplication.class, args);
	}

}
