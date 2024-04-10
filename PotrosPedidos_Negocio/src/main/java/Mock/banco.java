/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mock;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yohan
 */
public class banco {

    String Nombre, numero, fecha, cvv;
    List<banco> listaBanco;

    public banco() {
    }

    public banco(String Nombre, String numero, String fecha, String cvv) {
        this.Nombre = Nombre;
        this.numero = numero;
        this.fecha = fecha;
        this.cvv = cvv;
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

    public List<banco> getListaBanco() {
        return listaBanco;
    }

    public void setListaBanco(List<banco> listaBanco) {
        this.listaBanco = listaBanco;
    }

    public void generarLista() {
        List<banco> lista = new ArrayList<>();
        lista.add(new banco("José", "123456", "12/24", "123"));
        lista.add(new banco("María", "234567", "01/25", "234"));
        lista.add(new banco("Juan", "345678", "06/26", "345"));
        lista.add(new banco("Ana", "456789", "09/27", "456"));
        lista.add(new banco("Francisco", "567890", "03/28", "567"));
        lista.add(new banco("Guadalupe", "678901", "08/29", "678"));
        lista.add(new banco("María", "789012", "11/30", "789"));
        lista.add(new banco("Jesús", "890123", "02/31", "890"));
        lista.add(new banco("Juana", "901234", "05/32", "901"));
        lista.add(new banco("Antonio", "012345", "10/33", "012"));
        lista.add(new banco("Margarita", "123456", "04/34", "123"));
        lista.add(new banco("Pedro", "234567", "07/35", "234"));
        lista.add(new banco("Rosa", "345678", "12/36", "345"));
        lista.add(new banco("Carlos", "456789", "01/37", "456"));
        lista.add(new banco("Luisa", "567890", "06/38", "567"));
        lista.add(new banco("Alejandro", "678901", "09/39", "678"));
        lista.add(new banco("Patricia", "789012", "03/40", "789"));
        lista.add(new banco("Jorge", "890123", "08/41", "890"));
        lista.add(new banco("Verónica", "901234", "11/42", "901"));
        lista.add(new banco("Fernando", "012345", "02/43", "012"));

        setListaBanco(lista);
    }
}
