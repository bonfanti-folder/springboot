package hello;

public class Login {

    private Number id;
    private String externalId;
    private String password;
    private String firstName;
    private String lastName;
    private String token;
    private String email;
    private String type;
    private Roles[] roles;

    public Login() {

    }

    public void setId(Number id) {
        this.id = id;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setRoles(Roles[] roles) {
        this.roles = roles;
    }

    public Number getId() {
        return id;
    }

    public String getExternalId() {
        return externalId;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getToken() {
        return token;
    }

    public String getEmail() {
        return email;
    }

    public String getType() {
        return type;
    }

    public Roles[] getRoles() {
        return roles;
    }
}
