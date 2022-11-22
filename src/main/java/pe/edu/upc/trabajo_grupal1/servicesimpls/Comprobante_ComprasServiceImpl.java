package pe.edu.upc.trabajo_grupal1.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajo_grupal1.entities.ComprobanteFecha;
import pe.edu.upc.trabajo_grupal1.entities.ComprobanteMonto;
import pe.edu.upc.trabajo_grupal1.entities.Comprobante_Pago;
import pe.edu.upc.trabajo_grupal1.entities.PrendaMarca;
import pe.edu.upc.trabajo_grupal1.repositories.IComprobante_PagoRepository;
import pe.edu.upc.trabajo_grupal1.serviceinterfaces.IComprobante_ComprasService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class Comprobante_ComprasServiceImpl implements IComprobante_ComprasService {
    @Autowired
    private IComprobante_PagoRepository cpR;

    @Override
    public void insert(Comprobante_Pago comprobante_pago) {
        cpR.save(comprobante_pago);
    }

    @Override
    public List<Comprobante_Pago> list() {
        return cpR.findAll();
    }

    @Override
    public void delete(int idComprobante_Pago) {
        cpR.deleteById(idComprobante_Pago);
    }

    @Override
    public Optional<Comprobante_Pago> listarId(int idComprobante_Pago) {
        return Optional.of(cpR.findById(idComprobante_Pago).orElse(new Comprobante_Pago()));
    }

    @Override
    public List<Comprobante_Pago> buscarTipoComprobante(String nombrecomprobante) {
        return cpR.searchComprobante_Pago_Tipo(nombrecomprobante);
    }

@Override
    public List<Comprobante_Pago> buscarRazonSocial(String nombreRazonSocial) {
        return cpR.searchComprobante_Pago_Razon(nombreRazonSocial);
    }

    @Override
    public List<ComprobanteFecha>comprobanteF(){
        List<ComprobanteFecha>lista=new ArrayList<>();
        cpR.comprobanteFecha().forEach(y->{
            ComprobanteFecha c = new ComprobanteFecha();
            c.setCantidad(y[0]);
            c.setFecha(y[1]);
            lista.add(c);
        });
        return lista;
    }

    @Override
    public List<ComprobanteMonto>comprobanteM(){
        List<ComprobanteMonto>lista=new ArrayList<>();
        cpR.ComprobanteMonto().forEach(y->{
            ComprobanteMonto c = new ComprobanteMonto();
            c.setCantidad(y[0]);
            c.setFecha(y[1]);
            lista.add(c);
        });
        return lista;
    }
}
