
package pe.edu.upc.trabajo_grupal1.entities;

public class ComprobanteMonto {
    private String cantidad;
    private String fecha;

    public String getCantidad() { return cantidad; }
    public void setCantidad(String cantidad) {this.cantidad=cantidad;}

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) {this.fecha=fecha;}

    public ComprobanteMonto(String cantidad,String fecha) {

        this.cantidad=cantidad;
        this.fecha=fecha;
    }
    public ComprobanteMonto() {

    }
}
