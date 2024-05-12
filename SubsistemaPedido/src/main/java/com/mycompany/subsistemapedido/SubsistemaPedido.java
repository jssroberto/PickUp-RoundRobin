/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.subsistemapedido;

import control.ControlPedido;
import dominio.DetalleProducto;
import dominio.MetodoPago;
import dominio.Pedido;
import interfaces.IControlPedido;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jl4ma
 */
public class SubsistemaPedido {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        IControlPedido pe = new ControlPedido();
        List<DetalleProducto> pro = new ArrayList<>();
        pro.add(new DetalleProducto(1, 100.f, "a", 60.f, 1,1, "a", "a"));
        pe.persistir(new Pedido("a", "a", "1", LocalDate.now(), pro.size(), 0.0f, MetodoPago.EFECTIVO, pro));
    }
}
