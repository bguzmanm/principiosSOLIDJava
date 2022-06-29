package solid.abiertocerrado;

/**
 * PrincipiosSolid
 * solid.abiertocerrado
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 29-06-22
 */
public class CalculoArea {

    public double area(Figura[] figuras){
        double area = 0;

        for (Figura f: figuras) {

                //si tenemos que cambiar el comportamiento de esta clase
            // dependiendo del subtipo, es que no cumplimos el proncipio de sustitución de Liskov.
/*            if (f instanceof Circulo){

            }*/

            area += f.area();
        }

        return area;
    }
}
