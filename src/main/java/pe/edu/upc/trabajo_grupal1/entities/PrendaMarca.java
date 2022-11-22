package pe.edu.upc.trabajo_grupal1.entities;

public class PrendaMarca {
    private String prenda;
    private String marca;

    public String getPrenda(){
        return prenda;
    }

    public void setPrenda(String prenda) {
        this.prenda = prenda;
    }
    public String getMarca() { return marca; }

    public void setMarca(String marca) {this.marca=marca;}

    public PrendaMarca(String prenda, String precio) {
        this.prenda=prenda;
        this.marca=marca;
    }
    public PrendaMarca() {

    }
}
