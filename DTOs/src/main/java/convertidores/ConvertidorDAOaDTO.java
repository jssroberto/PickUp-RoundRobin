/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidores;

import dominio.Carrito;
import dominio.DetalleProducto;
import dominio.Producto;
import dominio.ProductoCafeteria;
import dominio.Tarjeta;
import dominio.Usuario;
import dtos.CarritoDTO;
import dtos.DetalleProductoDTO;
import dtos.ProductoCafeteriaDTO;
import dtos.ProductoDTO;
import dtos.TarjetaDTO;
import dtos.UsuarioDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author galan
 */
public class ConvertidorDAOaDTO {
    
//    public UsuarioDTO convertirDAOenDTO(Usuario usuario) {
//        
//    }
//    
//    public ProductoDTO convertirDAOenDTO(Producto producto) {
//        
//    }
//    
    public ProductoCafeteriaDTO convertirDAOenDTO(ProductoCafeteria productoCafeteria) {
        ProductoCafeteriaDTO productoCafeteriaDTO = new ProductoCafeteriaDTO();
        
        productoCafeteriaDTO.setPrecio(productoCafeteria.getPrecio());
        productoCafeteriaDTO.setNombre(productoCafeteria.getNombre());
        productoCafeteriaDTO.setDescripcion(productoCafeteria.getDescripcion());
        productoCafeteriaDTO.setCantidadDisponible(productoCafeteria.getCantidadDisponible());
        productoCafeteriaDTO.setDireccionImagen(productoCafeteria.getDireccionImagen());
        productoCafeteriaDTO.setIdProductoCafeteria(productoCafeteria.getId());
        return productoCafeteriaDTO;
    }
//    
//    public CarritoDTO convertirDAOenDTO(Carrito carrito) {
//        
//    }
//    
//    public DetalleProductoDTO convertirDAOenDTO(DetalleProducto detalleCarrito) {
//        
//    }
    
    public TarjetaDTO convertirDAOenDTO(Tarjeta tarjeta){
        TarjetaDTO tarjetaDTO= new TarjetaDTO();
        
        tarjetaDTO.setCvv(tarjeta.getCvv());
        tarjetaDTO.setFechaVencimiento(tarjeta.getFechaVencimiento());
        tarjetaDTO.setId(tarjeta.getId());
        tarjetaDTO.setNumeroTarjeta(tarjeta.getNumeroTarjeta());
        tarjetaDTO.setSaldo(tarjeta.getSaldo());
    }
    
}
