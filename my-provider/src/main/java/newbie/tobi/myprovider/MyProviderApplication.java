package newbie.tobi.myprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "newbie.tobi.myprovider")
public class MyProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProviderApplication.class, args);
	}

}
