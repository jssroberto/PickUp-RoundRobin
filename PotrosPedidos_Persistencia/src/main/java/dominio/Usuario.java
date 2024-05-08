/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author jl4ma
 */
public class Usuario {

    private ObjectId id;
    private String Nombre, apellidoPaterno, apellidoMaterno;
    private Date Fechanacimiento;
    private Carrito carrito;
    private List<ObjectId> pedidos;

    public Usuario() {
    }

    public Usuario(String Nombre, String apellidoPaterno, String apellidoMaterno, Date Fechanacimiento, Carrito carrito, List<ObjectId> pedidos) {
        this.Nombre = Nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.Fechanacimiento = Fechanacimiento;
        this.carrito = carrito;
        this.pedidos = pedidos;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
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

    public Date getFechanacimiento() {
        return Fechanacimiento;
    }

    public void setFechanacimiento(Date Fechanacimiento) {
        this.Fechanacimiento = Fechanacimiento;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    public List<ObjectId> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<ObjectId> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", Nombre=" + Nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", Fechanacimiento=" + Fechanacimiento + ", carrito=" + carrito + ", pedidos=" + pedidos + '}';
    }
    
}
