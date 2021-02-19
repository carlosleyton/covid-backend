@JsonIgnoreProperties(ignoreUnknown = true)
public class DaysCountryApi {

  private Number confirmed;
  private Number deaths;
  private Number recovered;
  private Number active;
  private Date date;
	public DaysCountryApi() {
	}

	@Override
	public String toString() {
		return "{" +
			" confirmed='" + getConfirmed() + "'" +
			", deaths='" + getDeaths() + "'" +
			", recovered='" + getRecovered() + "'" +
			", active='" + getActive() + "'" +
			", date='" + getDate() + "'" +
			"}";
	}

	public Number getConfirmed() {
		return this.confirmed;
	}

	public void setConfirmed(Number confirmed) {
		this.confirmed = confirmed;
	}

	public Number getDeaths() {
		return this.deaths;
	}

	public void setDeaths(Number deaths) {
		this.deaths = deaths;
	}

	public Number getRecovered() {
		return this.recovered;
	}

	public void setRecovered(Number recovered) {
		this.recovered = recovered;
	}

	public Number getActive() {
		return this.active;
	}

	public void setActive(Number active) {
		this.active = active;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}