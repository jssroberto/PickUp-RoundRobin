/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.disenosw.dtos;


/**
 *
 * @author yohan
 */
public class TarjetaDTO {
 
    private Long id;

    private String numeroTarjeta,nombre;
    
    private String fechaVencimiento;

    private Integer cvv;

    public TarjetaDTO() {
    }

    public TarjetaDTO(Long id, String numeroTarjeta, String nombre, String fechaVencimiento, Integer cvv) {
        this.id = id;
        this.numeroTarjeta = numeroTarjeta;
        this.nombre = nombre;
        this.fechaVencimiento = fechaVencimiento;
        this.cvv = cvv;
    }

    public TarjetaDTO(String numeroTarjeta, String nombre, String fechaVencimiento, Integer cvv) {
        this.numeroTarjeta = numeroTarjeta;
        this.nombre = nombre;
        this.fechaVencimiento = fechaVencimiento;
        this.cvv = cvv;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Integer getCvv() {
        return cvv;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }
    
}
