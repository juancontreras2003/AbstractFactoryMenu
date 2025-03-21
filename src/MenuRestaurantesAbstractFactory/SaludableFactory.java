package MenuRestaurantesAbstractFactory;

/**
 *
 * @author juanc
 */
class SaludableFactory extends MenuFactory {
    @Override
    public Entrada crearEntrada() {
        return new EntradaSaludable();
    }

    @Override
    public PlatoPrincipal crearPlatoPrincipal() {
        return new PlatoPrincipalSaludable();
    }

    @Override
    public Bebida crearBebida() {
        return new BebidaSaludable();
    }

    @Override
    public Postre crearPostre() {
        return new PostreSaludable();
    }
}