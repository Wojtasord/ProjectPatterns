package builder.user;

public class UserAdress {
    private String streetName;
    private int streetNumber;
    private int postalCode;

    private UserAdress(String streetName, int postalCode, int streetNumber) {
        this.streetName = streetName;
        this.postalCode = postalCode;
        this.streetNumber = streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public static class UserAdressBuilder {
        private String streetName;
        private int postalCode;
        private int streetNumber;

        private UserAdressBuilder(String streetName, int postalCode, int streetNumber) {
            this.streetName = streetName;
            this.postalCode = postalCode;
            this.streetNumber = streetNumber;
        }

        public static UserAdressBuilder aUserAdress(String streetName, int postalCode, int streetNumber) {
            return new UserAdressBuilder(streetName, postalCode, streetNumber);
        }

        public UserAdress build() {
            UserAdress userAdress = new UserAdress(streetName, postalCode, streetNumber);

            return userAdress;
        }
    }
}
