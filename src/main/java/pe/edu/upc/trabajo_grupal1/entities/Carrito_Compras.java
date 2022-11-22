package pe.edu.upc.trabajo_grupal1.entities;

import javax.persistence.*;

@Entity
@Table(name = "Carrito_de_compras")
public class Carrito_Compras {

    public Carrito_Compras() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCarrito_Compras;

    @Column(name = "Cantidad", length = 50, nullable = false)
    private int cantidad;

    @ManyToOne
    @JoinColumn(name = "idPrenda", nullable = false)
    private Prenda prenda;

    public Carrito_Compras(int idCarrito_Compras, int cantidad, Prenda prenda) {
        this.idCarrito_Compras = idCarrito_Compras;
        this.cantidad = cantidad;
        this.prenda = prenda;
    }

    public int getIdCarrito_Compras() {
        return idCarrito_Compras;
    }

    public void setIdCarrito_Compras(int idCarrito_Compras) {
        this.idCarrito_Compras = idCarrito_Compras;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Prenda getPrenda() {
        return prenda;
    }

    public void setPrenda(Prenda prenda) {
        this.prenda = prenda;
    }
}
