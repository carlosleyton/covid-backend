package carlosleyton.daysservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@SpringBootApplication
public class DaysServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaysServiceApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		@GetMapping("/list")
		return args -> {
			DaysCountry daysCountry = restTemplate.getForObject(
					"https://api.covid19api.com/country/{country}", DaysCountry.class);
			log.info(daysCountry.toString());
		};
	}
}
