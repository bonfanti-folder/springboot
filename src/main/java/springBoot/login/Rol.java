package springBoot.login;

public class Rol {
    private Number id;
    private String authority;

    public Rol(Number id, String authority) {
        this.id = id;
        this.authority = authority;
    }

    public Number getId() {
        return id;
    }

    public String getAuthority() {
        return authority;
    }
}
