package pe.edu.upc.trabajo_grupal1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trabajo_grupal1.entities.Carrito_Compras;

import java.util.List;

@Repository
public interface ICarrito_ComprasRepository extends JpaRepository<Carrito_Compras,Integer> {

    @Query("from Carrito_Compras cp where cp.prenda.nombrePrenda like %:nombrePrenda")
    List<Carrito_Compras> searchPrenda(@Param("nombrePrenda") String nombrePrenda);

    List<Carrito_Compras> findByPrenda(String valor);
}
