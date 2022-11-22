package pe.edu.upc.trabajo_grupal1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajo_grupal1.entities.Carrito_Compras;
import pe.edu.upc.trabajo_grupal1.entities.Prenda;
import pe.edu.upc.trabajo_grupal1.serviceinterfaces.ICarrito_ComprasService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/carrito_de_compras")
public class Carrito_ComprasController {
    @Autowired
    private ICarrito_ComprasService cpService;

    @PostMapping
    public void registrar(@RequestBody Carrito_Compras cp) {
        cpService.insert(cp);
    }
    @GetMapping
    public List<Carrito_Compras> listar() {
        return cpService.list();
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        cpService.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody Carrito_Compras carrito_compras){
        cpService.insert(carrito_compras);
    }
    @PostMapping("/buscar")
    public List<Carrito_Compras> buscar(@RequestBody Carrito_Compras carrito_compras)throws ParseException {
        List<Carrito_Compras> listaCarrito_Compras;
        listaCarrito_Compras = cpService.buscarPrenda(carrito_compras.getPrenda().getNombrePrenda());
        return listaCarrito_Compras;
    }
    @GetMapping("/{id}")
    public Optional<Carrito_Compras> listarId(@PathVariable("id") Integer id) {
        return cpService.listarId(id);
    }

}
