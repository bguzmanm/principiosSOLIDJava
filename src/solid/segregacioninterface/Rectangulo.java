package solid.segregacioninterface;

/**
 * PrincipiosSolid
 * solid.segregacioninterface
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 29-06-22
 */
public class Rectangulo implements IFigura, ICuadratico {

    public double alto;
    public double ancho;

    public Rectangulo(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public double area() {
        return this.alto * this.ancho;
    }

    @Override
    public double cantidadCuadrados() {
        return (this.alto * this.ancho) / 2;
    }
}
