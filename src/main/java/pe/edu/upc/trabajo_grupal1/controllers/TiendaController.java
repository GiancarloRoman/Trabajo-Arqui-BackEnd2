package pe.edu.upc.trabajo_grupal1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajo_grupal1.entities.Prenda;
import pe.edu.upc.trabajo_grupal1.entities.Tienda;
import pe.edu.upc.trabajo_grupal1.serviceinterfaces.ITiendaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tiendas")
public class TiendaController {
    @Autowired
    private ITiendaService tService;

    @PostMapping
    public void registrar(@RequestBody Tienda t) {
        tService.insert(t);
    }
    @GetMapping
    public List<Tienda> listar() {
        return tService.list();
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        tService.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody Tienda tienda){
        tService.insert(tienda);
    }
    @PostMapping("/buscar")
    public List<Tienda> buscar(@RequestBody Tienda tienda){
        List<Tienda> lista;
        tienda.setNombreTienda(tienda.getNombreTienda());
        lista=tService.search(tienda.getNombreTienda());
        return lista;
    }
    @GetMapping("/{id}")
    public Optional<Tienda> listarId(@PathVariable("id") Integer id) {
        return tService.listarId(id);
    }

    @PostMapping("/buscardireccion")
    public List<Tienda> buscarDireccion(@RequestBody String direccion) { return tService.buscarDireccion(direccion);}
}
