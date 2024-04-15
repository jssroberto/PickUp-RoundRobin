package org.itson.disenosw.dominio;

import java.util.List;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author jl4ma
 */
@Entity
@Table(name = "productos")
public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long id;
    
    @Column(name = "precio", nullable = false)
    private Float precio;
    
    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;
    
    @Column(name = "descripcion", length = 200, nullable = true)
    private String descripcion;
    
    @Column(name = "cantidad", nullable = false)
    private Integer cantidad;
    
    @ManyToMany(mappedBy = "productos")
    private List<Carrito> carritos;
    
    @ManyToMany(mappedBy = "productos")
    private List<Pedido> pedidos;

    public Producto() {
    }

    public Producto(Float precio, String nombre, Integer cantidad) {
        this.precio = precio;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public Producto(Float precio, String nombre, String descripcion, Integer cantidad) {
        this.precio = precio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public List<Carrito> getCarritos() {
        return carritos;
    }

    public void setCarritos(List<Carrito> carritos) {
        this.carritos = carritos;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    
    public boolean estaDisponible(){
        return getCantidad() > 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{");
        sb.append("id=").append(id);
        sb.append(", precio=").append(precio);
        sb.append(", nombre=").append(nombre);
        sb.append(", descripcion=").append(descripcion);
        sb.append(", cantidad=").append(cantidad);
        sb.append(", carritos=").append(carritos);
        sb.append(", pedidos=").append(pedidos);
        sb.append('}');
        return sb.toString();
    }
    
    
}
