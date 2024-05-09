/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOs;

import insercionesMasivas.InsercionMasivaBanco;
import insercionesMasivas.InsercionMasivaProductos;
import insercionesMasivas.InsercionMasivaProductosCafeteriaBO;
import insercionesMasivas.InsercionMasivaUsuarios;
import insercionesMasivas.InsercionMasivaUsuariosCIA;

/**
 *
 * @author galan
 */
public class InsercionMasiva {
    InsercionMasivaUsuariosCIA insercionUsuariosCIA = new InsercionMasivaUsuariosCIA();
    InsercionMasivaProductosCafeteriaBO insercionCafeteria = new InsercionMasivaProductosCafeteriaBO();
    InsercionMasivaUsuarios insercionUsuarios = new InsercionMasivaUsuarios();
    InsercionMasivaProductos insercionProductos = new InsercionMasivaProductos();
    InsercionMasivaBanco insercionBanco = new InsercionMasivaBanco();
    
    public void insercionUsuariosCIA() throws Exception{
        insercionUsuariosCIA.insertarRegistros();
    }
    
    public void insercionesCafeteria() throws Exception{
        insercionCafeteria.insertarRegistros();
    }
    
    public void insercionesUsuario() throws Exception{
        insercionUsuarios.insertarRegistros();
    }
    
    public void insercionesProductos() throws Exception{
        insercionProductos.insertarRegistros();
    }
    
    public void insercionesBanco() throws Exception{
        insercionBanco.insertarRegistros();
    }
}
