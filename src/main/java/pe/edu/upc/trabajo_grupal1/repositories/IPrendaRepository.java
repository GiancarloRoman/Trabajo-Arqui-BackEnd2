package pe.edu.upc.trabajo_grupal1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trabajo_grupal1.entities.Prenda;

import java.util.List;

@Repository
public interface IPrendaRepository extends JpaRepository<Prenda,Integer> {
    @Query("from Prenda p where p.nombrePrenda like %:nombrePrenda")
    List<Prenda> searchPrenda(@Param("nombrePrenda") String nombrePrenda);

    @Query("from Prenda p where p.tienda.nombreTienda like %:nombreTienda")
    List<Prenda> searchTienda(@Param("nombreTienda") String nombreTienda);

    @Query("from Prenda p where p.marca.nombreMarca like %:nombreMarca")
    List<Prenda> searchMarca(@Param("nombreMarca") String nombreMarca);

    @Query("from Prenda p where p.talla.letraTalla like %:letraTalla")
    List<Prenda> searchTalla(@Param("letraTalla") String letraTalla);

    @Query(value = "Select nombre_prenda, MAX(precio_unitario) From prenda Group by nombre_prenda", nativeQuery = true)
    List<String[]> prendaMayorPrecio();

    @Query(value = "Select nombre_prenda, MIN(precio_unitario) From prenda Group by nombre_prenda", nativeQuery = true)
    List<String[]> prendaMenorPrecio();

    @Query(value ="SELECT nombre_prenda,nombre_marca from prenda p inner join marca m on m.id_marca = p.id_marca",nativeQuery = true)
    List<String[]>prendaMarca();
}
