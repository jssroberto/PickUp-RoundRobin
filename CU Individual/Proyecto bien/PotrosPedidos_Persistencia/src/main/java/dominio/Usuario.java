package dominio;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author jl4ma
 */
@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long id;

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name = "apellido_paterno", length = 30, nullable = false)
    private String apellidoPaterno;

    @Column(name = "apellido_materno", length = 30, nullable = false)
    private String apellidoMaterno;
    
    //este a futuro debe ser nullable false
    @Column(name = "id_usuario_cia", nullable = false, unique = true)
    private String idUsuarioCia;

//    @OneToOne(mappedBy = "usuario", cascade = CascadeType.PERSIST)
    @OneToOne(mappedBy = "usuario", cascade = CascadeType.PERSIST)
    private Carrito carrito;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.PERSIST)
    private List<Pedido> pedidos;

    public Usuario() {
    }

    public Usuario(String nombre, String apellidoPaterno, String apellidoMaterno) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    public Usuario(String nombre, String apellidoPaterno, String apellidoMaterno, String idUsuarioCia, Carrito carrito) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.idUsuarioCia = idUsuarioCia;
        this.carrito = carrito;
    }


    public Usuario(String nombre, String apellidoPaterno, String apellidoMaterno, String idUsuarioCia) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.idUsuarioCia = idUsuarioCia;
    }
    
    

    public Usuario(Long id, String nombre, String apellidoPaterno, String apellidoMaterno) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    public Usuario(String nombre, String apellidoPaterno, String apellidoMaterno, Carrito carrito) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.carrito = carrito;
    }

    public Usuario(Long id, String nombre, String apellidoPaterno, String apellidoMaterno, Carrito carrito) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.carrito = carrito;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getIdUsuarioCia() {
        return idUsuarioCia;
    }

    public void setIdUsuarioCia(String idUsuarioCia) {
        this.idUsuarioCia = idUsuarioCia;
    }
    
    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Usuario{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellidoPaterno=").append(apellidoPaterno);
        sb.append(", apellidoMaterno=").append(apellidoMaterno);
        sb.append(", carrito=").append(carrito);
        sb.append(", pedidos=").append(pedidos);
        sb.append('}');
        return sb.toString();
    }

}
