package solid.inversionDependencias;

/**
 * PrincipiosSolid
 * solid.inversionDependencias
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 29-06-22
 */
public class PaymentType {
    public int id;
    public String nombre;

    public PaymentType(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
}
