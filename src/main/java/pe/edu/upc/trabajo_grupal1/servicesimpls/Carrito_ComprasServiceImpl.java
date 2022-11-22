package pe.edu.upc.trabajo_grupal1.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajo_grupal1.entities.Carrito_Compras;
import pe.edu.upc.trabajo_grupal1.repositories.ICarrito_ComprasRepository;
import pe.edu.upc.trabajo_grupal1.serviceinterfaces.ICarrito_ComprasService;

import java.util.List;
import java.util.Optional;

@Service
public class Carrito_ComprasServiceImpl implements ICarrito_ComprasService {
    @Autowired
    private ICarrito_ComprasRepository cpR;
    @Override
    public void insert(Carrito_Compras carrito_compras) {
        cpR.save(carrito_compras);
    }

    @Override
    public List<Carrito_Compras> list() {
        return cpR.findAll();
    }

    @Override
    public void delete(int idCarrito_Compras) {
        cpR.deleteById(idCarrito_Compras);
    }

    @Override
    public Optional<Carrito_Compras> listarId(int idCarrito_Compras) {
        return Optional.of(cpR.findById(idCarrito_Compras).orElse(new Carrito_Compras()));
    }

    @Override
    public List<Carrito_Compras> buscarPrenda(String nombrePrenda) {
        return cpR.searchPrenda(nombrePrenda);
    }

}
