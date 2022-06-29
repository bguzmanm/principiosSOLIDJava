package solid.segregacioninterface;

/**
 * PrincipiosSolid
 * solid.segregacioninterface
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 29-06-22
 */
public class CalculoArea {

    public double area(IFigura[] figuras){
        double area = 0;
        for (IFigura f : figuras) {
            area += f.area();
        }
        return area;
    }

    public double calculodeCuadrados(ICuadratico[] figuras){
        double cuadrados = 0;
        for (ICuadratico f : figuras) {
            cuadrados += f.cantidadCuadrados();

        }
        return cuadrados;
    }

}
