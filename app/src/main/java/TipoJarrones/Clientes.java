package TipoJarrones;

public class Clientes {
    private int id;
    private String[] Clientes = {"Sermieh", "Jacinta"};

    public Clientes(){
        id=1;
    }
    public Clientes(int id, String[] Clientes){
        this.id = id;
        this.Clientes = Clientes;
    }
    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String[] getClientes(){
        return Clientes;
    }
    public void setClientes(String[] clientes) {this.Clientes =clientes;}

    public int calcularPrecioJarrones(int precio, int tipo){
        int resultado = precio * tipo;
        return resultado;
    }
    public int resultadoFinalJarron(int preciofinal, int adicional) {
        int result = preciofinal + adicional;
        return result;
    }
    }


