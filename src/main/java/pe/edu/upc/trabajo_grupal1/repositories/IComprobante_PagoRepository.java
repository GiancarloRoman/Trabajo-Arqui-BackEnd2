package pe.edu.upc.trabajo_grupal1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trabajo_grupal1.entities.Comprobante_Pago;

import java.util.List;

@Repository
public interface IComprobante_PagoRepository extends JpaRepository<Comprobante_Pago,Integer> {
    @Query("from Comprobante_Pago cp where cp.tipoComprobante like %:tipoComprobante")
    List<Comprobante_Pago> searchComprobante_Pago_Tipo(@Param("tipoComprobante") String tipoComprobante);

    @Query("from Comprobante_Pago cp where cp.razonsocial like %:razonsocial")
    List<Comprobante_Pago> searchComprobante_Pago_Razon(@Param("razonsocial") String razonsocial);

    @Query(value = "SELECT fecha ,count (tipo_comprobante) as Cantidad FROM comprobante_de_pago c where c.fecha >'2022-11-20' GROUP BY fecha",nativeQuery = true)
    List<String[]>comprobanteFecha();

    @Query(value="SELECT fecha,sum(monto_total) as TOTAL_DIARIO from comprobante_de_pago GROUP BY fecha",nativeQuery = true)
    List<String[]>ComprobanteMonto();
}
