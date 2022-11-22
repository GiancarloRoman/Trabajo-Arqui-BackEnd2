package pe.edu.upc.trabajo_grupal1.serviceinterfaces;

import pe.edu.upc.trabajo_grupal1.entities.Cliente;
import pe.edu.upc.trabajo_grupal1.entities.Marca;
import java.util.List;
import java.util.Optional;

public interface IMarcaService {
    public void insert(Marca marca);
    List<Marca> list();
    public void delete(int idMarca);
    public Optional<Marca> listarId(int idMarca);

    List<Marca>search(String nombreMarca);

    List<Marca>buscarMarca(String nombre);
}
