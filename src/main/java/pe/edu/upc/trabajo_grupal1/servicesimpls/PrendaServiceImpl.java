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
 @Override
    public List<Prenda> buscarTienda(String nombreTienda) {
        return pR.searchTienda(nombreTienda);
    }

    @Override
    public List<Prenda> buscarMarca(String nombreMarca) {
        return pR.searchMarca(nombreMarca);
    }

    @Override
    public List<Prenda> buscarTalla(String letraTalla) {
        return pR.searchTalla(letraTalla);
    }

    @Override
    public List<Mayor> prendaMayor(){
        List<Mayor>lista=new ArrayList<>();
        pR.prendaMayorPrecio().forEach(y->{
            Mayor r=new Mayor();
            r.setPrenda(y[0]);
            r.setPrecio(y[1]);
            lista.add(r);
        });
        return lista;
    }
    public List<Menor> prendaMenor(){
        List<Menor>lista=new ArrayList<>();
        pR.prendaMenorPrecio().forEach(y->{
            Menor r=new Menor();
            r.setPrenda(y[0]);
            r.setPrecio(y[1]);
            lista.add(r);
        });
        return lista;
    }

    @Override
    public List<PrendaMarca>prendaM(){
        List<PrendaMarca>lista=new ArrayList<>();
            pR.prendaMarca().forEach(y->{
            PrendaMarca p=new PrendaMarca();
            p.setPrenda(y[0]);
            p.setMarca(y[1]);
            lista.add(p);
        });
        return lista;
    }
}


}
