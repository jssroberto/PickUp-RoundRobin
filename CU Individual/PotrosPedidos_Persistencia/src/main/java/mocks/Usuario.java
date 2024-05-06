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
public class Usuario {
    
    Long id_usuario;
    String ID;
    String contra;
    List<Usuario> listaaUsuarios;

    public Usuario(String ID, String contra) {
        this.ID = ID;
        this.contra = contra;
    }
    

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public List<Usuario> getListaaUsuarios() {
        return listaaUsuarios;
    }

    public void setListaaUsuarios(List<Usuario> listaaUsuarios) {
        this.listaaUsuarios = listaaUsuarios;
    }

    public Usuario(Long id_usuario, String ID, String contra) {
        this.id_usuario = id_usuario;
        this.ID = ID;
        this.contra = contra;
        listaaUsuarios = new ArrayList<>();
    }
    

    public Usuario() {
        listaaUsuarios = new ArrayList<>();
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
        lista.add(new Usuario(1L,"000001234599", "c1"));
        lista.add(new Usuario(2L,"000002345532", "c2"));
        lista.add(new Usuario(3L,"000001222356", "c3"));
        lista.add(new Usuario(4L,"00000244903", "madero"));
        lista.add(new Usuario(5L,"000001254532", "c5"));
        lista.add(new Usuario(6L,"000002352322", "c6"));
        lista.add(new Usuario(7L,"000002324244", "c7"));
        lista.add(new Usuario(8L,"000002342555", "c8"));
        lista.add(new Usuario(9L,"000005566422", "c9"));
        lista.add(new Usuario(10L,"000001214566", "c10"));
        lista.add(new Usuario(11L,"000009786645", "c11"));
        lista.add(new Usuario(12L,"000005685855", "c12"));
        lista.add(new Usuario(13L,"000004744333", "c13"));
        lista.add(new Usuario(14L,"000004568888", "c14"));
        lista.add(new Usuario(15L,"000004774444", "c15"));
        lista.add(new Usuario(16L,"000003636778", "c16"));
        lista.add(new Usuario(17L,"000006344634", "c17"));
        lista.add(new Usuario(18L,"00000244907", "yohan"));
        lista.add(new Usuario(19L,"00000244913", "tito"));
        lista.add(new Usuario(20L,"00000244752", "pablo"));

        setListaUsuarios(lista);
    }

}
