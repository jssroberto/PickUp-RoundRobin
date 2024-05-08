/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author jl4ma
 */
public class Usuario {

    private ObjectId id;
    private String idCia;
    private String Nombre, apellidoPaterno, apellidoMaterno;
    private Date Fechanacimiento;
    private Carrito carrito;
    private Integer saldoPuntos;
    private List<ObjectId> pedidos;

    public Usuario() {
        pedidos = new ArrayList<>();
    }

    public Usuario(ObjectId id, String idCia, String Nombre, String apellidoPaterno, String apellidoMaterno, Date Fechanacimiento, Carrito carrito, Integer saldoPuntos, List<ObjectId> pedidos) {
        this.id = id;
        this.idCia = idCia;
        this.Nombre = Nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.Fechanacimiento = Fechanacimiento;
        this.carrito = carrito;
        this.saldoPuntos = saldoPuntos;
        this.pedidos = pedidos;
    }

    public Usuario(String idCia, String Nombre, String apellidoPaterno, String apellidoMaterno, Date Fechanacimiento, Carrito carrito, Integer saldoPuntos, List<ObjectId> pedidos) {
        this.idCia = idCia;
        this.Nombre = Nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.Fechanacimiento = Fechanacimiento;
        this.carrito = carrito;
        this.saldoPuntos = saldoPuntos;
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

    public String getIdCia() {
        return idCia;
    }

    public void setIdCia(String idCia) {
        this.idCia = idCia;
    }

    public Integer getSaldoPuntos() {
        return saldoPuntos;
    }

    public void setSaldoPuntos(Integer saldoPuntos) {
        this.saldoPuntos = saldoPuntos;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", idCia=" + idCia + ", Nombre=" + Nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", Fechanacimiento=" + Fechanacimiento + ", carrito=" + carrito + ", saldoPuntos=" + saldoPuntos + ", pedidos=" + pedidos + '}';
    }

    
    
}
