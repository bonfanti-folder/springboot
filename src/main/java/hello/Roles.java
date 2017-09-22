package hello;

public class Roles {
    private Number id;
    private String authority;

    public Roles(Number id, String authority) {
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
