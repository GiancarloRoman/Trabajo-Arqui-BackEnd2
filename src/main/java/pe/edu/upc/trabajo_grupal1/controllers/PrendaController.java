package pe.edu.upc.trabajo_grupal1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajo_grupal1.entities.Mayor;
import pe.edu.upc.trabajo_grupal1.entities.Menor;
import pe.edu.upc.trabajo_grupal1.entities.Prenda;
import pe.edu.upc.trabajo_grupal1.entities.PrendaMarca;
import pe.edu.upc.trabajo_grupal1.serviceinterfaces.IPrendaService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/prendas")
public class PrendaController {
    @Autowired
    private IPrendaService pService;

    @PostMapping
    public void registrar(@RequestBody Prenda p) {
        pService.insert(p);
    }
    @GetMapping
    public List<Prenda> listar() {
        return pService.list();
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        pService.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody Prenda prenda){
        pService.insert(prenda);
    }
    @PostMapping("/buscar")
    public List<Prenda> buscar(@RequestBody Prenda prenda)throws ParseException {
        List<Prenda> listaPrendas;
        listaPrendas = pService.search(prenda.getNombrePrenda());

        if (listaPrendas.isEmpty()) {

            listaPrendas = pService.buscarTienda(prenda.getTienda().getNombreTienda());
            if (listaPrendas.isEmpty()) {

                listaPrendas = pService.buscarMarca(prenda.getMarca().getNombreMarca());
            }
            if (listaPrendas.isEmpty()) {

                listaPrendas = pService.buscarTalla(prenda.getTalla().getLetraTalla());
            }
        }
        return listaPrendas;
    }
    @GetMapping("/{id}")
    public Optional<Prenda> listarId(@PathVariable("id") Integer id) {
        return pService.listarId(id);
    }


}
