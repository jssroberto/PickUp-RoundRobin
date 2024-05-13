package BOs;

import DAOs.ProductoDAO;
import IDAOs.IProductoDAO;
import Interfaz.IProductoBO;
import com.mongodb.MongoException;
import dominio.Producto;
import dtos.ProductoDTO;
import excepciones.BOException;
import excepciones.PersistenciaException;

/**
 *
 * @author Roberto García
 */
public class ProductoBO implements IProductoBO {

    @Override
    public void persistir(Producto producto) throws BOException {
        IProductoDAO productoDAO = new ProductoDAO();
        try {
            productoDAO.persistir(producto);
        } catch (PersistenciaException e) {
            throw new BOException(e.getMessage(), e);
        }
    }
    public ProductoDTO convertirDAOenDTO(Producto producto) {
        ProductoDTO productoDTO= new ProductoDTO();
        
        productoDTO.setDescripcion(producto.getDescripcion());
        productoDTO.setDireccionImagen(producto.getDireccionImagen());
        productoDTO.setId(producto.getId().toString());
        productoDTO.setNombre(producto.getNombre());
        productoDTO.setPrecio(producto.getPrecio());
        productoDTO.setPuntosGenera(producto.getPuntosGenera());
        
        return productoDTO;
    }
    
    @Override
    public ProductoDTO consultarProducto(Producto pro) throws BOException {
        IProductoDAO productoDAO = new ProductoDAO();

        try {
            Producto producto =productoDAO.consultar(pro);


            ProductoDTO productoDTO =convertirDAOenDTO(producto);

            return productoDTO;
            //TODO cambiar Exception por DAOException
        } catch (PersistenciaException e) {
            throw new BOException(e.getMessage(), e);
        }
    }

    @Override
    public ProductoDTO consultarProducto(Long idProducto) throws BOException {
        IProductoDAO productoDAO = new ProductoDAO();
        try {
            Producto producto = productoDAO.consultar(idProducto);
            ProductoDTO productoDTO = convertirDAOenDTO(producto);
            return productoDTO;
            //TODO cambiar Exception por DAOException
        } catch (PersistenciaException e) {
            throw new BOException(e.getMessage(), e);
        }
    }

}
