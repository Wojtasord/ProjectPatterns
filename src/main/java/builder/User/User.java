package builder.User;

public class User {

    private String name;
    private String surname;
    private String email;
    private Sex sex;
    private UserAdress adress;

    private User() {
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public Sex getSex() {
        return sex;
    }

    public UserAdress getAdress() {
        return adress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public void setAdress(UserAdress adress) {
        this.adress = adress;
    }

    public static class UserBuilder {
        private String name;
        private String surname;
        private String email;
        private Sex sex;
        private UserAdress adress;

        private UserBuilder() {
        }

        public static UserBuilder aUser() {
            return new UserBuilder();
        }

        public UserBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder withSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public UserBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder withSex(Sex sex) {
            this.sex = sex;
            return this;
        }

        public UserBuilder withAdress(UserAdress adress) {
            this.adress = adress;
            return this;
        }

        public User build() {
            User user = new User();
            user.setName(name);
            user.setSurname(surname);
            user.setEmail(email);
            user.setSex(sex);
            user.setAdress(adress);
            return user;
        }
    }
}
