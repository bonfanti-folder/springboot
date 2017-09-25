package springBoot.empresa;

public class Empresa {

    private String nombre;
    private String lema;
    private String[] valores;

    public Empresa(String nombre, String lema, String[] valores) {
        this.nombre = nombre;
        this.lema = lema;
        this.valores = valores;
    }

    public Empresa() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLema() {
        return lema;
    }

    public void setLema(String lema) {
        this.lema = lema;
    }

    public String[] getValores() {
        return valores;
    }

    public void setValores(String[] valores) {
        this.valores = valores;
    }
}