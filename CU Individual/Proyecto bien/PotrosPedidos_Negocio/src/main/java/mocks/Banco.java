
package mocks;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yohan
 */
public class Banco {

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
        lista.add(new Banco("José", "123456", "12/24", "123"));
        lista.add(new Banco("María", "234567", "01/25", "234"));
        lista.add(new Banco("Juan", "345678", "06/26", "345"));
        lista.add(new Banco("Ana", "456789", "09/27", "456"));
        lista.add(new Banco("Francisco", "567890", "03/28", "567"));
        lista.add(new Banco("Guadalupe", "678901", "08/29", "678"));
        lista.add(new Banco("María", "789012", "11/30", "789"));
        lista.add(new Banco("Jesús", "890123", "02/31", "890"));
        lista.add(new Banco("Juana", "901234", "05/32", "901"));
        lista.add(new Banco("Antonio", "012345", "10/33", "012"));
        lista.add(new Banco("Margarita", "123456", "04/34", "123"));
        lista.add(new Banco("Pedro", "234567", "07/35", "234"));
        lista.add(new Banco("Rosa", "345678", "12/36", "345"));
        lista.add(new Banco("Carlos", "456789", "01/37", "456"));
        lista.add(new Banco("Luisa", "567890", "06/38", "567"));
        lista.add(new Banco("Alejandro", "678901", "09/39", "678"));
        lista.add(new Banco("Patricia", "789012", "03/40", "789"));
        lista.add(new Banco("Jorge", "890123", "08/41", "890"));
        lista.add(new Banco("Verónica", "901234", "11/42", "901"));
        lista.add(new Banco("Fernando", "012345", "02/43", "012"));

        setListaBanco(lista);
    }
}
