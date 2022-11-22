package pe.edu.upc.trabajo_grupal1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajo_grupal1.entities.Cliente;
import pe.edu.upc.trabajo_grupal1.entities.ClienteFrecuente;
import pe.edu.upc.trabajo_grupal1.entities.Prenda;
import pe.edu.upc.trabajo_grupal1.serviceinterfaces.IClienteService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private IClienteService cService;

    @PostMapping
    public void registrar(@RequestBody Cliente c) {
        cService.insert(c);
    }
    @GetMapping
    public List<Cliente> listar() {
        return cService.list();
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        cService.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody Cliente cliente){
        cService.insert(cliente);
    }
    @PostMapping("/buscar")
    public List<Cliente> buscar(@RequestBody String nombre) throws ParseException
        {
            List<Cliente> listaClientes;
            listaClientes = cService.search(nombre);
            return listaClientes;
        }
    @GetMapping("/{id}")
    public Optional<Cliente> listarId(@PathVariable("id") Integer id) {
        return cService.listarId(id);
    }

    @PostMapping("/buscaremail")
    public List<Cliente> buscarEmail(@RequestBody String email){
        return cService.buscarEmail(email);
    }

}
