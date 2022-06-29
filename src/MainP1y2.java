import solid.abiertocerrado.*;

/**
 * $PROJECT_NAME
 * Ejemplo de implementación siguiendo los principios SOLID de
 * Abierto/Cerrado y Sustitución de Liskov
 * @author Brian Guzmán M.
 * @version 0.1
 * @since $DATE
 */
public class MainP1y2 {
    public static void main(String[] args) {

        Rectangulo r1 = new Rectangulo(3,4);
        Rectangulo r2 = new Rectangulo(2,5);
        Circulo c1 = new Circulo(3);
        Triangulo t1 = new Triangulo(4,2);
        Figura f1 = new Figura();

        Figura[] lista = new Figura[5];
        lista[0] = r1;
        lista[1] = r2;
        lista[2] = c1;
        lista[3] = t1;
        lista[4] = f1;

        CalculoArea ca = new CalculoArea();
        System.out.println("El área de los elementos es: " + ca.area(lista));


    }
}