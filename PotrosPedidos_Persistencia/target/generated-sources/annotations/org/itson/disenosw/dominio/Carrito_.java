package org.itson.disenosw.dominio;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.itson.disenosw.dominio.Producto;
import org.itson.disenosw.dominio.Usuario;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-04-15T00:43:35", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Carrito.class)
public class Carrito_ { 

    public static volatile SingularAttribute<Carrito, Float> total;
    public static volatile SingularAttribute<Carrito, Integer> cantidadProductos;
    public static volatile SingularAttribute<Carrito, Usuario> usuario;
    public static volatile SingularAttribute<Carrito, Long> id;
    public static volatile ListAttribute<Carrito, Producto> productos;

}