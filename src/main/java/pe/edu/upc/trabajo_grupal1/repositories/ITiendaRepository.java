package pe.edu.upc.trabajo_grupal1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trabajo_grupal1.entities.Tienda;

import java.util.List;

@Repository
public interface ITiendaRepository extends JpaRepository<Tienda,Integer> {
    @Query("from Tienda t where t.nombreTienda like %:nombreTienda")
    List<Tienda> search(@Param("nombreTienda") String nombreTienda);

    List<Tienda> findByDireccionTienda(String valor);


}
