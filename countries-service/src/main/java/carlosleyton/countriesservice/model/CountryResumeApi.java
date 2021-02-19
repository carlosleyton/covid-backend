@JsonIgnoreProperties(ignoreUnknown = true)
public class CountryResumeApi {

  private String country;
  private Number totalConfirmed;
  private Number totalDeaths;
  private Number totalRecovered;

	@Override
	public String toString() {
		return "{" +
			" country='" + getCountry() + "'" +
			", totalConfirmed='" + getTotalConfirmed() + "'" +
			", totalDeaths='" + getTotalDeaths() + "'" +
			", totalRecovered='" + getTotalRecovered() + "'" +
			"}";
	}


	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Number getTotalConfirmed() {
		return this.totalConfirmed;
	}

	public void setTotalConfirmed(Number totalConfirmed) {
		this.totalConfirmed = totalConfirmed;
	}

	public Number getTotalDeaths() {
		return this.totalDeaths;
	}

	public void setTotalDeaths(Number totalDeaths) {
		this.totalDeaths = totalDeaths;
	}

	public Number getTotalRecovered() {
		return this.totalRecovered;
	}

	public void setTotalRecovered(Number totalRecovered) {
		this.totalRecovered = totalRecovered;
	}

	public CountryResumeApi() {
	}

}