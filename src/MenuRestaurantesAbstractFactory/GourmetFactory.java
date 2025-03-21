package MenuRestaurantesAbstractFactory;

/**
 *
 * @author juanc
 */
class GourmetFactory extends MenuFactory {
    @Override
    public Entrada crearEntrada() {
        return new EntradaGourmet();
    }

    @Override
    public PlatoPrincipal crearPlatoPrincipal() {
        return new PlatoPrincipalGourmet();
    }

    @Override
    public Bebida crearBebida() {
        return new BebidaGourmet();
    }

    @Override
    public Postre crearPostre() {
        return new PostreGourmet();
    }
}
