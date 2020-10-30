package Model;

public class City {
    private int cityId;
    private String cityName;
    private Country country;

    public City(){
        this.cityId = 0;
        this.cityName = "";
        this.country = new Country();
    }

    public City(int cityId, String cityName, Country country){
        this.cityId = cityId;
        this.cityName = cityName;
        this.country = country;
    }

    public boolean isValid(){
        return this.cityId != 0 && this.cityName != "" && this.country.getCountryId() != 0;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Country getCountry(){
        return this.country;
    }

    public void setCountry(Country country){
        this.country = country;
    }

    public String toString(){
        return this.cityName;
    }
}
