@JsonIgnoreProperties(ignoreUnknown = true)
public class CountryResume {

  private String country;
  private Number id;
  private String countryCode;
  private String slug;
  private Number newConfirmed;
  private Number totalConfirmed;
  private Number newDeaths;
  private Number totalDeaths;
  private Number newRecovered;
  private Number totalRecovered;

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

  public String getSlug() {
    return this.slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public Number getNewConfirmed() {
    return this.newConfirmed;
  }

  public void setNewConfirmed(Number newConfirmed) {
    this.newConfirmed = newConfirmed;
  }

  public Number getTotalConfirmed() {
    return this.totalConfirmed;
  }

  public void setTotalConfirmed(Number totalConfirmed) {
    this.totalConfirmed = totalConfirmed;
  }

  public Number getNewDeaths() {
    return this.newDeaths;
  }

  public void setNewDeaths(Number newDeaths) {
    this.newDeaths = newDeaths;
  }

  public Number getTotalDeaths() {
    return this.totalDeaths;
  }

  public void setTotalDeaths(Number totalDeaths) {
    this.totalDeaths = totalDeaths;
  }

  public Number getNewRecovered() {
    return this.newRecovered;
  }

  public void setNewRecovered(Number newRecovered) {
    this.newRecovered = newRecovered;
  }

  public Number getTotalRecovered() {
    return this.totalRecovered;
  }

  public void setTotalRecovered(Number totalRecovered) {
    this.totalRecovered = totalRecovered;
  }

  public Date getDate() {
    return this.date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public String getPremium() {
    return this.premium;
  }

  public void setPremium(String premium) {
    this.premium = premium;
  }
  private Date date;
  private String premium;

  public CountryResume() {
  }


  @Override
  public String toString() {
    return "{" +
      " country='" + getCountry() + "'" +
      ", id='" + getId() + "'" +
      ", countryCode='" + getCountryCode() + "'" +
      ", slug='" + getSlug() + "'" +
      ", newConfirmed='" + getNewConfirmed() + "'" +
      ", totalConfirmed='" + getTotalConfirmed() + "'" +
      ", newDeaths='" + getNewDeaths() + "'" +
      ", totalDeaths='" + getTotalDeaths() + "'" +
      ", newRecovered='" + getNewRecovered() + "'" +
      ", totalRecovered='" + getTotalRecovered() + "'" +
      ", date='" + getDate() + "'" +
      ", premium='" + getPremium() + "'" +
      "}";
  }

}