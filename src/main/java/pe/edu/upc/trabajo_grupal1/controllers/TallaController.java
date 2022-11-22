package pe.edu.upc.trabajo_grupal1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajo_grupal1.entities.Prenda;
import pe.edu.upc.trabajo_grupal1.entities.Talla;
import pe.edu.upc.trabajo_grupal1.serviceinterfaces.ITallaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tallas")
public class TallaController {
    @Autowired
    private ITallaService tService;

    @PostMapping
    public void registrar(@RequestBody Talla t) {
        tService.insert(t);
    }
    @GetMapping
    public List<Talla> listar() {
        return tService.list();
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        tService.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody Talla talla){
        tService.insert(talla);
    }
    @PostMapping("/buscar")
    public List<Talla> buscar(@RequestBody Talla talla){
        List<Talla> lista;
        talla.setLetraTalla(talla.getLetraTalla());
        lista=tService.search(talla.getLetraTalla());
        return lista;
    }
    @GetMapping("/{id}")
    public Optional<Talla> listarId(@PathVariable("id") Integer id) {
        return tService.listarId(id);
    }
}
