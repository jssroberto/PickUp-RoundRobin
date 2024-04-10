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
public class Usuario {

    String ID;
    String contra;
    List<Usuario> listaaUsuarios;

    public Usuario(String ID, String contra) {
        this.ID = ID;
        this.contra = contra;
    }

    public Usuario() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public List<Usuario> getListaUsuarios() {
        return listaaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaaUsuarios) {
        this.listaaUsuarios = listaaUsuarios;
    }

    public void generarLista() {
        List<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("u1", "c1"));
        lista.add(new Usuario("u2", "c2"));
        lista.add(new Usuario("u3", "c3"));
        lista.add(new Usuario("u4", "c4"));
        lista.add(new Usuario("u5", "c5"));
        lista.add(new Usuario("u6", "c6"));
        lista.add(new Usuario("u7", "c7"));
        lista.add(new Usuario("u8", "c8"));
        lista.add(new Usuario("u9", "c9"));
        lista.add(new Usuario("u10", "c10"));
        lista.add(new Usuario("u11", "c11"));
        lista.add(new Usuario("u12", "c12"));
        lista.add(new Usuario("u13", "c13"));
        lista.add(new Usuario("u14", "c14"));
        lista.add(new Usuario("u15", "c15"));
        lista.add(new Usuario("u16", "c16"));
        lista.add(new Usuario("u17", "c17"));
        lista.add(new Usuario("u18", "c18"));
        lista.add(new Usuario("u19", "c19"));
        lista.add(new Usuario("u20", "c20"));

        setListaUsuarios(lista);
    }

}
