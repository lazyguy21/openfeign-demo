package newbie.tobi.myconsumer;

import feign.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@EnableFeignClients
@SpringBootApplication
public class MyConsumerApplication {
	@Bean
	Logger.Level feignLoggerLevel() {
//    return Logger.Level.NONE;
//    return Logger.Level.BASIC;
//    return Logger.Level.HEADERS;
		return Logger.Level.FULL;
	}
	public static void main(String[] args) {
		SpringApplication.run(MyConsumerApplication.class, args);
	}

}
