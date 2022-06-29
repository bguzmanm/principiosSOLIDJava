package solid.inversionDependencias;

/**
 * PrincipiosSolid
 * solid.inversionDependencias
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 29-06-22
 */
public class OracleDatabase implements Persistencia {
    @Override
    public void save(Producto p, PaymentType pt) {
        System.out.println("Pago en Oracle el producto " + p.nombre + " con el metodo " + pt.nombre);
    }
}
