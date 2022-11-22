package pe.edu.upc.trabajo_grupal1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajo_grupal1.entities.Cliente;
import pe.edu.upc.trabajo_grupal1.entities.Marca;
import pe.edu.upc.trabajo_grupal1.entities.Prenda;
import pe.edu.upc.trabajo_grupal1.serviceinterfaces.IMarcaService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/marcas")
public class MarcaController {
    @Autowired
    private IMarcaService mService;

    @PostMapping
    public void registrar(@RequestBody Marca m) {
        mService.insert(m);
    }
    @GetMapping
    public List<Marca> listar() {
        return mService.list();
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        mService.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody Marca marca){
        mService.insert(marca);
    }
    @PostMapping("/buscar")
    public List<Marca> buscar(@RequestBody String nombre) throws ParseException
    {List<Marca> listaMarcas;
        listaMarcas = mService.search(nombre);
        return listaMarcas;
    }
    @GetMapping("/{id}")
    public Optional<Marca> listarId(@PathVariable("id") Integer id) {
        return mService.listarId(id);
    }

    @PostMapping("/buscarnombre")
    public List<Marca> buscarMarca(@RequestBody String nombre) {return mService.buscarMarca(nombre);}
}
