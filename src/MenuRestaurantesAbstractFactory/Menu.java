
package MenuRestaurantesAbstractFactory;

/**
 *
 * @author juanc
 */
class Menu {
    private Entrada entrada;
    private PlatoPrincipal platoPrincipal;
    private Bebida bebida;
    private Postre postre;

    public Menu(MenuFactory factory) {
        this.entrada = factory.crearEntrada();
        this.platoPrincipal = factory.crearPlatoPrincipal();
        this.bebida = factory.crearBebida();
        this.postre = factory.crearPostre();
    }

    public void mostrarMenu() {
        System.out.println("Entrada: " + entrada.descripcion());
        System.out.println("Plato Principal: " + platoPrincipal.descripcion());
        System.out.println("Bebida: " + bebida.descripcion());
        System.out.println("Postre: " + postre.descripcion());
    }
}
