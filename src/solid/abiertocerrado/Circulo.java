package solid.abiertocerrado;

/**
 * PrincipiosSolid
 * solid.abiertocerrado
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 29-06-22
 */
public class Circulo extends Figura{
    public double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return (radio*radio)*Math.PI;
    }
}
