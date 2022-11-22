package pe.edu.upc.trabajo_grupal1.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajo_grupal1.entities.*;
import pe.edu.upc.trabajo_grupal1.repositories.IPrendaRepository;
import pe.edu.upc.trabajo_grupal1.serviceinterfaces.IPrendaService;
import pe.edu.upc.trabajo_grupal1.entities.Mayor;
import pe.edu.upc.trabajo_grupal1.entities.PrendaMarca;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PrendaServiceImpl implements IPrendaService {

    @Autowired
    private IPrendaRepository pR;
    @Override
    public void insert(Prenda prenda) {
        pR.save(prenda);
    }

    @Override
    public List<Prenda> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int idPrenda) {
        pR.deleteById(idPrenda);
    }

    @Override
    public Optional<Prenda> listarId(int idPrenda) {
        return Optional.of(pR.findById(idPrenda).orElse(new Prenda()));
    }

    @Override
    public List<Prenda> search(String nombrePrenda) {
        return pR.searchPrenda(nombrePrenda);
    }


}
