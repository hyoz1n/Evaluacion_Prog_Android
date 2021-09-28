package TipoJarrones;
public class Jarrones {
    private int id;
    private String[] jarrones = {"Ceramica", "Porcelana", "Vidrio"};

    public Jarrones() {
        id = 1;
    }

    public Jarrones(int id, String[] jarrones) {
        this.id = id;
        this.jarrones = jarrones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getJarrones() {
        return jarrones;
    }

    public void setJarrones(String[] jarrones) {
        this.jarrones = jarrones;
    }

}