package builder.user;

import lombok.Data;
import org.apache.commons.validator.routines.EmailValidator;

@Data
public class User {

    private String name;
    private String surname;
    private String email;
    private Sex sex;
    private UserAdress adress;

    public static UserBuilder aUser() {
        return new UserBuilder();
    }

    public boolean validateMail() {
        EmailValidator emailValidator = EmailValidator.getInstance();
        if (emailValidator.isValid(email)) {
            return true;
        }
        return false;
    }

    public static class UserBuilder {
        private String name;
        private String surname;
        private String email;
        private Sex sex;
        private UserAdress adress;

        private UserBuilder() {
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
