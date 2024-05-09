package objetosNegocio;

import DAOs.ProductoDAO;
import IDAOs.IProductoDAO;
import com.mongodb.MongoException;
import convertidores.ConvertidorDAOaDTO;
import dominio.Producto;
import dtos.ProductoDTO;
import excepciones.BOException;
import excepciones.PersistenciaException;
import interfaces.IProductoBO;

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

    @Override
    public ProductoDTO consultarProducto(String nombre) throws BOException {
        IProductoDAO productoDAO = new ProductoDAO();

        try {
            Producto producto = productoDAO.consultarProducto(nombre);
            ConvertidorDAOaDTO convertidorDAOaDTO = new ConvertidorDAOaDTO();

            ProductoDTO productoDTO = convertidorDAOaDTO.convertirDAOenDTO(producto);

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
            Producto producto = productoDAO.consultarProducto(idProducto)x;
            ConvertidorDAOaDTO convertidorDAOaDTO = new ConvertidorDAOaDTO();
            ProductoDTO productoDTO = convertidorDAOaDTO.convertirDAOenDTO(producto);
            return productoDTO;
            //TODO cambiar Exception por DAOException
        } catch (PersistenciaException e) {
            throw new BOException(e.getMessage(), e);
        }
    }

}
