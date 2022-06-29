package solid.inversionDependencias;

/**
 * PrincipiosSolid
 * solid.inversionDependencias
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 29-06-22
 */
public class Cash {

    Persistencia persistencia;

    public Cash(Persistencia persistencia){
        this.persistencia = persistencia;
    }

    public void pay(Producto producto, PaymentType paymentType){
        persistencia.save(producto, paymentType);
    }

}
