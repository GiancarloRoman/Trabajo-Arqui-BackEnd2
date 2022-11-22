package pe.edu.upc.trabajo_grupal1.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajo_grupal1.entities.Cliente;
import pe.edu.upc.trabajo_grupal1.entities.ClienteFrecuente;
import pe.edu.upc.trabajo_grupal1.entities.PrendaMarca;
import pe.edu.upc.trabajo_grupal1.repositories.IClienteRepository;
import pe.edu.upc.trabajo_grupal1.serviceinterfaces.IClienteService;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements IClienteService {
    @Autowired
    private IClienteRepository cR;
    @Override
    public void insert(Cliente cliente) {
        cR.save(cliente);
    }

    @Override
    public List<Cliente> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int idCliente) {
        cR.deleteById(idCliente);
    }

    @Override
    public Optional<Cliente> listarId(int idCliente) {
        return Optional.of(cR.findById(idCliente).orElse(new Cliente()));
    }

    @Override
    public List<Cliente> search(String nombreCliente) {
        return cR.search(nombreCliente);
    }

    @Override
    public List<Cliente> buscarEmail(String email) {
        return cR.findByEmailCliente(email);
    }

    @Override
    public List<Cliente> buscarDominio() {
        return cR.buscardominio();
    }

    @Override
    public List<ClienteFrecuente>clienteFrecuente(){
        List<ClienteFrecuente>lista=new ArrayList<>();
            cR.clienteFrecuente().forEach(y->{
            ClienteFrecuente c=new ClienteFrecuente();
            c.setCliente(y[0]);
            c.setComprobantepago(y[1]);
            lista.add(c);
        });
        return lista;
    }
}

