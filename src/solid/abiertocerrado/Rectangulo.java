package solid.abiertocerrado;

/**
 * PrincipiosSolid
 * solid.abiertocerrado
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 29-06-22
 */
public class Rectangulo extends Figura {

    public double ancho;
    public double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double area() {
        return this.ancho * this.alto;
    }
}
