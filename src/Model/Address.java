package Model;

import Exception.AddressException;

public class Address {
    private int addressId;
    private String address;
    private String address2;
    private City city;
    private String postalCode;
    private String phone;

    public Address(){
        this.addressId = 0;
        this.address = "";
        this.address2 = "";
        this.city = null;
        this.postalCode = "";
        this.phone = "";
    }

    public Address(int addressId, String address, String address2, City city, String postalCode, String phone){
        this.addressId = addressId;
        this.address = address;
        this.address2 = address2;
        this.city = city;
        this.postalCode = postalCode;
        this.phone = phone;
    }

    public int getAddressId() {
        return this.addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return this.address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public City getCity() {
        return this.city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isValid() throws AddressException {
        if(this.address.equals("")){
            throw new AddressException("Address 1 is required");
        }

        if(this.address2.equals("")){
            throw new AddressException("Address 2 is required");
        }

        if(this.city == null){
            throw new AddressException("City is required");
        }

        if(this.postalCode.equals("")){
            throw new AddressException("Postal Code/Zip is required");
        }

        if(this.phone.equals("")){
            throw new AddressException("Phone is required");
        }


        return true;
    }
}
