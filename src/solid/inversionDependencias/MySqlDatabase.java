package solid.inversionDependencias;

/**
 * PrincipiosSolid
 * solid.inversionDependencias
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 29-06-22
 */
public class MySqlDatabase implements Persistencia {

    public String nombreClase;
    public String url;
    public String usr;
    public String psw;

    public MySqlDatabase() {
    }

    public MySqlDatabase(String nombreClase, String url, String usr, String psw) {
        this.nombreClase = nombreClase;
        this.url = url;
        this.usr = usr;
        this.psw = psw;
    }
    @Override
    public void save(Producto producto, PaymentType paymentType){
        System.out.println("Guardando el pago de " + producto.nombre + " con el método " + paymentType.nombre);
    }
}
