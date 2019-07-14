package pl.sda.builder;

public class User {
    //1
    private String name;
    private String lastname;
    private boolean active;
    private String city;
    private String password;
    private String postalCode;
    //Będziemy chcieli stworzyć project tylko z jednym elementem
    //nie bedziemy teraz tworzyc recznie komstruktorow tylko poprzez

    //8 - crtl + Insert toString


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", active=" + active +
                ", city='" + city + '\'' +
                ", password='" + password + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }

    //2
    public static final class Builder{// final czyli żadna inna klasa nie moze jej rozszerzac(extence

        private String name;
        private String lastname;
        private boolean active;
        private String city;
        private String password;
        private String postalCode;

        //robimy takie jakby settery, dzieki ktorym mozemy tworzyc takie kropki:
     //4
        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder lastname(String lastname) {
            this.lastname = lastname;
            return this;
            //end 4
            //7
        }
        public Builder password(String password) {
            this.password = password;
            return this;
        }
        public Builder postalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;

        }
        public Builder active(boolean active) {
            this.active = active;
            return this;
        }
        public Builder city (String city) {
            this.city = city;
            return this;

        //end 7
        }
        //5
        public User build(){
            User user = new User();
            user.name = this.name;
            user.lastname = this.lastname;
            user.city = this.city;
            user.password = this.password;
            user.active = this.active;
            user.postalCode = this.postalCode;

            return user;
            //end 5
        }

    }

}
