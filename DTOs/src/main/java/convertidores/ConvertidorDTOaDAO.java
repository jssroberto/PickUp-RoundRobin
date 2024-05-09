/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidores;

import dominio.ProductoCafeteria;
import dominio.Tarjeta;
import dtos.ProductoCafeteriaDTO;
import dtos.TarjetaDTO;

/**
 *
 * @author galan
 */
public class ConvertidorDTOaDAO {
    
    //    public Usuario convertirDTOenDAO(UsuarioDTO usuarioDTO) {
//        
//    }
//    
//    public Producto convertirDTOenDAO(ProductoDTO productoDTO) {
//        
//    }
//    
    public ProductoCafeteria convertirDTOenDAO(ProductoCafeteriaDTO productoCafeteriaDTO) {
        ProductoCafeteria productoCafeteria = new ProductoCafeteria();
        
        productoCafeteria.setPrecio(productoCafeteriaDTO.getPrecio());
        productoCafeteria.setNombre(productoCafeteriaDTO.getNombre());
        productoCafeteria.setDescripcion(productoCafeteriaDTO.getDescripcion());
        productoCafeteria.setCantidadDisponible(productoCafeteriaDTO.getCantidadDisponible());
        productoCafeteria.setDireccionImagen(productoCafeteriaDTO.getDireccionImagen());
        productoCafeteria.setId(productoCafeteriaDTO.getIdProductoCafeteria());
        
        return productoCafeteria;
    }
//    
//    public Carrito convertirDTOenDAO(CarritoDTO carritoDTO) {
//        
//    }
//    
//    public DetalleProductoDTO convertirDTOenDAO(DetalleProducto detalleCarrito) {
//        
//    }
    
    public Tarjeta convertirDTOenDAO(TarjetaDTO tarjetaDTO){
        Tarjeta tarjeta= new Tarjeta();
        
        tarjeta.setCvv(tarjetaDTO.getCvv());
        tarjeta.setFechaVencimiento(tarjetaDTO.getFechaVencimiento());
        tarjeta.setId(tarjetaDTO.getId());
        tarjeta.setNumeroTarjeta(tarjetaDTO.getNumeroTarjeta());
        tarjeta.setSaldo(tarjetaDTO.getSaldo());
        return tarjeta;
    }
    
}
