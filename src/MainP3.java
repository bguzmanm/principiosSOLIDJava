import solid.segregacioninterface.*;

/**
 * PrincipiosSolid
 * PACKAGE_NAME
 * Ejemplo de implementación de los principios SOLID de
 * Segregación de Interfáces
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 29-06-22
 */
public class MainP3 {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(3,2);
        Circulo c1 = new Circulo();
        IFigura[] lista = new IFigura[2];
        ICuadratico[] listaCuadrados = new ICuadratico[1];

        lista[0] = r1;
        lista[1] = c1;

        listaCuadrados[0] = r1;

        CalculoArea ca = new CalculoArea();

        System.out.println("La suma de las áreas es: " + ca.area(lista));

        System.out.println("Puedes obtener " + ca.calculodeCuadrados(listaCuadrados) + " cuadrados");
    }
}
