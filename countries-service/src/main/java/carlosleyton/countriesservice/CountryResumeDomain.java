@JsonIgnoreProperties(ignoreUnknown = true)
public class CountryResumeDomain {

  private String message;
  private Number id;
  private Value global;
  private Value countries;

	public CountryResumeDomain() {
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Number getId() {
		return this.id;
	}

	public void setId(Number id) {
		this.id = id;
	}

	public Value getGlobal() {
		return this.global;
	}

	public void setGlobal(Value global) {
		this.global = global;
	}

	public Value getCountries() {
		return this.countries;
	}

	public void setCountries(Value countries) {
		this.countries = countries;
	}

	@Override
	public String toString() {
		return "{" +
			" message='" + getMessage() + "'" +
			", id='" + getId() + "'" +
			", global='" + getGlobal() + "'" +
			", countries='" + getCountries() + "'" +
			"}";
	}
}
