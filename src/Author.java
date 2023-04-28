public class Author {
    private String name;
    private String email;
    private String country;
    private char gender;

    public Author(String name, String email, String country, char gender) {
        this.name = name;
        this.email = email;
        this.country = country;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCountry() {
        return country;
    }

    public char getGender() {
        return gender;
    }
}