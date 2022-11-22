package pe.edu.upc.trabajo_grupal1.entities;

import javax.persistence.*;

@Entity
@Table(name = "Cliente")

public class Cliente {

    public Cliente() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCliente;

    @Column(name = "nombreCliente", length = 50, nullable = false)
    private String nombreCliente;

    @Column(name = "apellidoCliente", length = 50, nullable = false)
    private String apellidoCliente;

    @Column(name = "emailCliente", length = 40, nullable = false)
    private String emailCliente;

    @Column(name = "telefonoCliente", length = 9, nullable = false)
    private int telefonoCliente;

    @Column(name = "direccionCliente", length = 40, nullable = false)
    private String direccionCliente;

    public Cliente(int idCliente, String nombreCliente, String apellidoCliente, String emailCliente, int telefonoCliente, String direccionCliente) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.emailCliente = emailCliente;
        this.telefonoCliente = telefonoCliente;
        this.direccionCliente = direccionCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public int getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(int telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }
}
