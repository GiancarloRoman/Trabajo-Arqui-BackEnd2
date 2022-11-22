package pe.edu.upc.trabajo_grupal1.entities;

import javax.persistence.*;

@Entity
@Table(name = "Marca")
public class Marca {
    public Marca() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMarca;

    @Column(name = "nombreMarca", length = 50, nullable = false)
    private String nombreMarca;

    public Marca(int idMarca, String nombreMarca) {
        this.idMarca = idMarca;
        this.nombreMarca = nombreMarca;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }
}
