public class Address {

    private String Street;
    private String City;
    private String Eircode;
    private String Country;



    public Address(String Street, String City, String Eircode, String Country) {

        this.Street = Street;
        this.City = City;
        this.Eircode = Eircode;
        this.Country = Country;
    }

    public String getStreet() {
        return Street;
    }

    public String getCity(){
        return City;
    }

    public String getEircode(){
        return Eircode;
    }

    public String getCountry() {
        return Country;
    }
}
