package MenuRestaurantesAbstractFactory;

/**
 *
 * @author juanc
 */
abstract class MenuFactory {
    public abstract Entrada crearEntrada();
    public abstract PlatoPrincipal crearPlatoPrincipal();
    public abstract Bebida crearBebida();
    public abstract Postre crearPostre();
}