package pe.edu.upc.trabajo_grupal1.serviceinterfaces;

import pe.edu.upc.trabajo_grupal1.entities.Cliente;
import pe.edu.upc.trabajo_grupal1.entities.ClienteFrecuente;

import java.util.List;
import java.util.Optional;

public interface IClienteService {
    public void insert(Cliente cliente);
    List<Cliente>list();
    public void delete(int idPropietario);
    public Optional<Cliente> listarId(int idCliente);
    List<Cliente>search(String nombreCliente);

    List<Cliente>buscarEmail(String email);

    List<Cliente> buscarDominio();


}
