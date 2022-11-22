package pe.edu.upc.trabajo_grupal1.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajo_grupal1.entities.Tienda;
import pe.edu.upc.trabajo_grupal1.repositories.ITiendaRepository;
import pe.edu.upc.trabajo_grupal1.serviceinterfaces.ITiendaService;

import java.util.List;
import java.util.Optional;

@Service
public class TiendaServiceImpl implements ITiendaService {
    @Autowired
    private ITiendaRepository tR;
    @Override
    public void insert(Tienda tienda) {
        tR.save(tienda);
    }

    @Override
    public List<Tienda> list() {
        return tR.findAll();
    }

    @Override
    public void delete(int idTienda) {
        tR.deleteById(idTienda);
    }

    @Override
    public Optional<Tienda> listarId(int idTienda) {
        return Optional.of(tR.findById(idTienda).orElse(new Tienda()));
    }

    @Override
    public List<Tienda> search(String nombreTienda) {
        return tR.search(nombreTienda);
    }

    @Override
    public List<Tienda> buscarDireccion(String direccion) {
        return tR.findByDireccionTienda(direccion);
    }
}
