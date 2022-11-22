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


}
