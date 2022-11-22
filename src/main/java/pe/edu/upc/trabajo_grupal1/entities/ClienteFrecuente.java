package pe.edu.upc.trabajo_grupal1.entities;

public class ClienteFrecuente {
    private String cliente;
    private String comprobantepago;

    public String getCliente(){
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente =cliente;
    }
    public String getComprobantepago() { return comprobantepago; }

    public void setComprobantepago(String comprobantepago) {this.comprobantepago=comprobantepago;}

    public ClienteFrecuente(String cliente, String comprobantepago) {
        this.cliente=cliente;
        this.comprobantepago=comprobantepago;
    }
    public ClienteFrecuente() {

    }
}
