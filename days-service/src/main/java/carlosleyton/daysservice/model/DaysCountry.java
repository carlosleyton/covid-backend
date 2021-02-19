@JsonIgnoreProperties(ignoreUnknown = true)
public class DaysCountry {

  private String country;
  private Number id;
  private String countryCode;
  private String province;
  private String city;
  private String cityCode;
  private String lat;
  private String lon;
  private Number confirmed;
  private Number deaths;
  private Number recovered;
  private Number active;
  private Date date;
	public DaysCountry() {
	}

	@Override
	public String toString() {
		return "{" +
			" country='" + getCountry() + "'" +
			", id='" + getId() + "'" +
			", countryCode='" + getCountryCode() + "'" +
			", province='" + getProvince() + "'" +
			", city='" + getCity() + "'" +
			", cityCode='" + getCityCode() + "'" +
			", lat='" + getLat() + "'" +
			", lon='" + getLon() + "'" +
			", confirmed='" + getConfirmed() + "'" +
			", deaths='" + getDeaths() + "'" +
			", recovered='" + getRecovered() + "'" +
			", active='" + getActive() + "'" +
			", date='" + getDate() + "'" +
			"}";
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Number getId() {
		return this.id;
	}

	public void setId(Number id) {
		this.id = id;
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCityCode() {
		return this.cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getLat() {
		return this.lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLon() {
		return this.lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
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