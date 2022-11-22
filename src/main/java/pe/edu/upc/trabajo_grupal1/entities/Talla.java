package pe.edu.upc.trabajo_grupal1.entities;

import javax.persistence.*;

@Entity
@Table(name = "Talla")
public class Talla {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTalla;

    @Column(name = "letraTalla", length = 50, nullable = false)
    private String letraTalla;

    public Talla() {
    }

    public Talla(int idTalla, String letraTalla) {
        this.idTalla = idTalla;
        this.letraTalla = letraTalla;
    }

    public int getIdTalla() {
        return idTalla;
    }

    public void setIdTalla(int idTalla) {
        this.idTalla = idTalla;
    }

    public String getLetraTalla() {
        return letraTalla;
    }

    public void setLetraTalla(String letraTalla) {
        this.letraTalla = letraTalla;
    }
}
