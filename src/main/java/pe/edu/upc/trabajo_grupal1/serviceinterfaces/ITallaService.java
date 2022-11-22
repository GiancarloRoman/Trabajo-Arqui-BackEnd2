package pe.edu.upc.trabajo_grupal1.serviceinterfaces;

import pe.edu.upc.trabajo_grupal1.entities.Talla;
import java.util.List;
import java.util.Optional;

public interface ITallaService {
    public void insert(Talla talla);
    List<Talla> list();
    public void delete(int idTalla);
    public Optional<Talla> listarId(int idTalla);
    List<Talla>search(String letraTalla);
}
