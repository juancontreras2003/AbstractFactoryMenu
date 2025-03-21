package MenuRestaurantesAbstractFactory;

/**
 *
 * @author juanc
 */
class VegetarianoFactory extends MenuFactory {
    @Override
    public Entrada crearEntrada() {
        return new EntradaVegetariano();
    }

    @Override
    public PlatoPrincipal crearPlatoPrincipal() {
        return new PlatoPrincipalVegetariano();
    }

    @Override
    public Bebida crearBebida() {
        return new BebidaVegetariano();
    }

    @Override
    public Postre crearPostre() {
        return new PostreVegetariano();
    }
}

