/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosNegocio;

import daos.ProductoCafeteriaDAO;
import dominio.ProductoCafeteria;
import dtos.ProductoCafeteriaDTO;
import excepciones.BancoException;
import interfaces.IProductoCafeteriaBO;
import interfaces.IProductoCafeteriaDAO;
import java.util.List;
import excepciones.BOException;
import excepciones.CafeteriaException;
import excepciones.PersistenciaException;
import java.util.LinkedList;

/**
 *
 * @author jl4ma
 */
public class ProductoCafeteriaBO implements IProductoCafeteriaBO {

//    IProductoCafeteriaDAO cafeteria;
//
//    public ProductoCafeteriaBO() {
//        cafeteria = new ProductoCafeteriaDAO();
//
//    }
//
//    @Override
//    public List<ProductoCafeteriaDTO> obtenerTodosLosProductos() throws BOException {
//        ConvertidorDAOaDTO daoADto = new ConvertidorDAOaDTO();
//        List<ProductoCafeteria> productos;
//        try {
//            productos = cafeteria.obtenerTodosLosProductos();
//
//        } catch (CafeteriaException e){
//            throw new BOException(e.getMessage(), e);
//        }
//        if (productos.isEmpty()) {
//            throw new BOException("lista vacia");
//        } else {
//            List<ProductoCafeteriaDTO> productoCafeteriaDTO = new LinkedList<>();
//            for (ProductoCafeteria producto : productos) {
//                productoCafeteriaDTO.add(daoADto.convertirDAOenDTO(producto));
//            }
//
//            return productoCafeteriaDTO;
//        }
//
//    }
}
