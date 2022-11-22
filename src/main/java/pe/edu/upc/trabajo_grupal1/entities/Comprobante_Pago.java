package pe.edu.upc.trabajo_grupal1.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "Comprobante_de_Pago")
public class Comprobante_Pago {

    public Comprobante_Pago() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComprobante_Pago;

    @Column(name = "tipoComprobante", length = 20, nullable = false)
    private String tipoComprobante;

    @Column(name = "MontoTotal", nullable = false)
    private float montototal;



    @Column(name = "Fecha", nullable = false)
    private LocalDate fecha;

    @Column(name = "RazonSocial", length = 50, nullable = false)
    private String razonsocial;

    @ManyToOne
    @JoinColumn(name = "idCliente", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "idCarritoCompras", nullable = false)
    private Carrito_Compras carritocompras;

    public Comprobante_Pago(int idComprobante_Pago, String tipoComprobante, float montototal, LocalDate fecha, String razonsocial, Cliente cliente, Carrito_Compras carritocompras) {
        this.idComprobante_Pago = idComprobante_Pago;
        this.tipoComprobante = tipoComprobante;
        this.montototal = montototal;

        this.fecha = fecha;
        this.razonsocial = razonsocial;
        this.cliente = cliente;
        this.carritocompras = carritocompras;
    }

    public int getIdComprobante_Pago() {
        return idComprobante_Pago;
    }

    public void setIdComprobante_Pago(int idComprobante_Pago) {
        this.idComprobante_Pago = idComprobante_Pago;
    }

    public String getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(String tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }

    public float getMontototal() {
        return montototal;
    }

    public void setMontototal(float montototal) {
        this.montototal = montototal;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getRazonsocial() {
        return razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Carrito_Compras getCarritocompras() {
        return carritocompras;
    }

    public void setCarritocompras(Carrito_Compras carritocompras) {
        this.carritocompras = carritocompras;
    }
}
