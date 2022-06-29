package solid.abiertocerrado;

/**
 * PrincipiosSolid
 * solid.abiertocerrado
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 29-06-22
 */
public class Triangulo extends Figura {

    public double base;
    public double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return (this.base * this.altura)/2;
    }
}
