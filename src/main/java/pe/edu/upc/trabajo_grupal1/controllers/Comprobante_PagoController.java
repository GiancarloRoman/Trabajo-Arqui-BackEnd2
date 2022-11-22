package pe.edu.upc.trabajo_grupal1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajo_grupal1.entities.ComprobanteFecha;
import pe.edu.upc.trabajo_grupal1.entities.ComprobanteMonto;
import pe.edu.upc.trabajo_grupal1.entities.Comprobante_Pago;
import pe.edu.upc.trabajo_grupal1.serviceinterfaces.IComprobante_ComprasService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/comprobantes_pago")
public class Comprobante_PagoController {
    @Autowired
    private IComprobante_ComprasService cService;

    @PostMapping
    public void registrar(@RequestBody Comprobante_Pago cp) {
        cService.insert(cp);
    }
    @GetMapping
    public List<Comprobante_Pago> listar() {
        return cService.list();
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        cService.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody Comprobante_Pago comprobante_pago){
        cService.insert(comprobante_pago);
    }
    @PostMapping("/buscar")
    public List<Comprobante_Pago> buscar(@RequestBody Comprobante_Pago comprobante_pago)throws ParseException {
        List<Comprobante_Pago> listaComprobantes;
        listaComprobantes = cService.buscarTipoComprobante(comprobante_pago.getTipoComprobante());
        if (listaComprobantes.isEmpty()) {

            listaComprobantes = cService.buscarRazonSocial(comprobante_pago.getRazonsocial());
        }
        return listaComprobantes;
    }
    @GetMapping("/{id}")
    public Optional<Comprobante_Pago> listarId(@PathVariable("id") Integer id) {
        return cService.listarId(id);
    }
    
}
