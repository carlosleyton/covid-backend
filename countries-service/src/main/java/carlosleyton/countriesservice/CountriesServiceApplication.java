package carlosleyton.countriesservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CountriesServiceApplication {

	private static final Logger log = LoggerFactory.getLogger(CountriesServiceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CountriesServiceApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			CountryResumeDomain countryResumeDomain = restTemplate.getForObject(
					"https://api.covid19api.com/summary", CountryResumeDomain.class);
			log.info(countryResumeDomain.toString());
		};
	}

}
