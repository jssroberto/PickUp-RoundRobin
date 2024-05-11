package interfaces;

import dominio.Producto;
import dtos.ProductoDTO;
import excepciones.BOException;

/**
 *
 * @author Roberto García
 */
public interface IProductoBO {
    
    public void persistir(Producto producto) throws BOException;
    
    public ProductoDTO consultarProducto(Producto producto) throws BOException;
    
    public ProductoDTO consultarProducto(Long idProducto) throws BOException;
    
}
