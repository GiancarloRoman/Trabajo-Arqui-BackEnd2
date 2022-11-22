package pe.edu.upc.trabajo_grupal1.serviceinterfaces;

import pe.edu.upc.trabajo_grupal1.entities.Tienda;
import java.util.List;
import java.util.Optional;

public interface ITiendaService {
    public void insert(Tienda tienda);
    List<Tienda> list();
    public void delete(int idTienda);
    public Optional<Tienda> listarId(int idTienda);
    List<Tienda>search(String nombreTienda);

    List<Tienda>buscarDireccion(String email);
}
