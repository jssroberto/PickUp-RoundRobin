/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package insercionesMasivas;

import com.mycompany.cia.UsuarioCIA;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author jl4ma
 */
public class InsercionMasivaUsuariosCIA {
    
    List<UsuarioCIA> usuariosCIA = new ArrayList<>();
    public void insertarRegistros() throws Exception{
         EntityManagerFactory emfCIA = Persistence.createEntityManagerFactory("ciaPU");
            EntityManager emCIA = emfCIA.createEntityManager();
         usuariosCIA.add(new UsuarioCIA("00000011211", "ABC12345", "Juan", "Perez", "Garcia"));
        usuariosCIA.add(new UsuarioCIA("00000244454", "DEF67890", "Maria", "Lopez", "Martinez"));
        usuariosCIA.add(new UsuarioCIA("00000046574", "GHI13579", "Pedro", "Gonzalez", "Santos"));
        usuariosCIA.add(new UsuarioCIA("00000240157", "JKL24680", "Ana", "Rodriguez", "Fernandez"));
        usuariosCIA.add(new UsuarioCIA("00000244978", "MNO97531", "Luis", "Martinez", "Diaz"));
        emCIA.getTransaction().begin();
        for (UsuarioCIA usuarioCIA : usuariosCIA) {
            emCIA.persist(usuarioCIA);
        }
        emCIA.getTransaction().commit();
        emCIA.close();
    }
       
}
