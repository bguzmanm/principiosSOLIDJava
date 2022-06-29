package solid.inversionDependencias;

/**
 * PrincipiosSolid
 * solid.inversionDependencias
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 29-06-22
 */
public interface Persistencia {

    void save(Producto p, PaymentType pt);
}
