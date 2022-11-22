package pe.edu.upc.trabajo_grupal1.entities;

public class Menor {
    private String prenda;
    private String precio;

    public String getPrenda(){
        return prenda;
    }

    public void setPrenda(String prenda) {
        this.prenda = prenda;
    }
    public String getPrecio() { return precio; }

    public void setPrecio(String precio) {this.precio=precio;}

    public Menor(String prenda, String precio) {
        this.prenda=prenda;
        this.precio=precio;
    }
    public Menor() {

    }
}
