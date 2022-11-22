package pe.edu.upc.trabajo_grupal1.serviceinterfaces;

import pe.edu.upc.trabajo_grupal1.entities.ComprobanteFecha;
import pe.edu.upc.trabajo_grupal1.entities.ComprobanteMonto;
import pe.edu.upc.trabajo_grupal1.entities.Comprobante_Pago;

import java.util.List;
import java.util.Optional;

public interface IComprobante_ComprasService {
    public void insert(Comprobante_Pago comprobante_pago);
    List<Comprobante_Pago> list();
    public void delete(int idComprobante_Pago);
    public Optional<Comprobante_Pago> listarId(int idComprobante_Pago);
    List<Comprobante_Pago> buscarTipoComprobante(String nombrecomprobante);
    List<Comprobante_Pago> buscarRazonSocial(String nombreRazonSocial);
    List<ComprobanteFecha>comprobanteF();

    List<ComprobanteMonto>comprobanteM();

}
