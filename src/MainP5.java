import solid.inversionDependencias.*;

import java.util.ArrayList;
import java.util.List;

/**
 * PrincipiosSolid
 * PACKAGE_NAME
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 29-06-22
 */
public class MainP5 {

    public static void main(String[] args) {

        Persistencia persistencia = new OracleDatabase();

        Cash cash = new Cash(persistencia);
        Producto p = new Producto(1, "IPhone 17");
        PaymentType pt = new PaymentType(1, "Tarjeta de Crédito");

        cash.pay(p, pt);



    }
}
