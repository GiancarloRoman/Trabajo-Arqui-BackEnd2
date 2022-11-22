package pe.edu.upc.trabajo_grupal1.serviceinterfaces;

import pe.edu.upc.trabajo_grupal1.entities.Carrito_Compras;


import java.util.List;
import java.util.Optional;

public interface ICarrito_ComprasService {
    public void insert(Carrito_Compras carrito_compras);
    List<Carrito_Compras> list();
    public void delete(int idCarrito_Compras);
    public Optional<Carrito_Compras> listarId(int idCarrito_Compras);
    List<Carrito_Compras> buscarPrenda(String nombrePrenda);
}
