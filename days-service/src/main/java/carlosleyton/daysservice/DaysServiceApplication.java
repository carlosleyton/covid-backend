package carlosleyton.daysservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
		return args -> {
			DaysCountry daysCountry = restTemplate.getForObject(
					"https://api.covid19api.com/country/", DaysCountry.class);
			log.info(daysCountry.toString());
		};
	}
}
