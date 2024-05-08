/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mocks;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jl4ma
 */
public class Banco {
    Long id;
    String Nombre, numero, fecha, cvv;
    List<Banco> listaBanco;

    public Banco() {
    }

    public Banco(String Nombre, String numero, String fecha, String cvv) {
        this.Nombre = Nombre;
        this.numero = numero;
        this.fecha = fecha;
        this.cvv = cvv;
    }

    public Banco(Long id, String Nombre, String numero, String fecha, String cvv) {
        this.id = id;
        this.Nombre = Nombre;
        this.numero = numero;
        this.fecha = fecha;
        this.cvv = cvv;
    }
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public List<Banco> getListaBanco() {
        return listaBanco;
    }

    public void setListaBanco(List<Banco> listaBanco) {
        this.listaBanco = listaBanco;
    }

    public void generarLista() {
        List<Banco> lista = new ArrayList<>();
        lista.add(new Banco(1L,"José", "123456", "12/24", "123"));
        lista.add(new Banco(2L,"María", "234567", "01/25", "234"));
        lista.add(new Banco(3L,"Juan", "345678", "06/26", "345"));
        lista.add(new Banco(4L,"Ana", "456789", "09/27", "456"));
        lista.add(new Banco(5L,"Francisco", "567890", "03/28", "567"));
        lista.add(new Banco(6L,"Guadalupe", "678901", "08/29", "678"));
        lista.add(new Banco(7L,"María", "789012", "11/30", "789"));
        lista.add(new Banco(8L,"Jesús", "890123", "02/31", "890"));
        lista.add(new Banco(9L,"Juana", "901234", "05/32", "901"));
        lista.add(new Banco(10L,"Antonio", "012345", "10/33", "012"));
        lista.add(new Banco(11L,"Margarita", "123456", "04/34", "123"));
        lista.add(new Banco(12L,"Pedro", "234567", "07/35", "234"));
        lista.add(new Banco(13L,"Rosa", "345678", "12/36", "345"));
        lista.add(new Banco(14L,"Carlos", "456789", "01/37", "456"));
        lista.add(new Banco(15L,"Luisa", "567890", "06/38", "567"));
        lista.add(new Banco(16L,"Alejandro", "678901", "09/39", "678"));
        lista.add(new Banco(17L,"Patricia", "789012", "03/40", "789"));
        lista.add(new Banco(18L,"Jorge", "890123", "08/41", "890"));
        lista.add(new Banco(19L,"Verónica", "901234", "11/42", "901"));
        lista.add(new Banco(20L,"Fernando", "012345", "02/43", "012"));

        setListaBanco(lista);
    }
}
