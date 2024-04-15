package org.itson.disenosw.dominio;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author jl4ma
 */
@Entity
@Table(name = "carritos")
public class Carrito implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carrito")
    private Long id;
    
    @Column(name = "total", nullable = false)
    private Float total;

    @Column(name = "cantidad_productos", nullable = false)
    private Integer cantidadProductos;
    
    @ManyToMany
    @JoinTable(name = "carritos_productos", 
            joinColumns = @JoinColumn(name = "id_carrito"), 
            inverseJoinColumns = @JoinColumn(name = "id_producto"))
    private List<Producto> productos;
    
    @OneToOne
    @JoinColumn(name = "id_usuario") //referecedColumnName
    private Usuario usuario;

    public Carrito() {
    }

    public Carrito(Usuario usuario) {
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Integer getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(Integer cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProducto(List<Producto> productos) {
        this.productos = productos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Carrito(Float total, Integer cantidadProductos, List<Producto> productos, Usuario usuario) {
        this.total = total;
        this.cantidadProductos = cantidadProductos;
        this.productos = productos;
        this.usuario = usuario;
    }
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Carrito{");
        sb.append("id=").append(id);
        sb.append(", total=").append(total);
        sb.append(", cantidadProductos=").append(cantidadProductos);
        sb.append(", producto=").append(productos);
        sb.append(", usuario=").append(usuario);
        sb.append('}');
        return sb.toString();
    }    

}
