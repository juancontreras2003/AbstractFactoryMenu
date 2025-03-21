
package MenuRestaurantesAbstractFactory;
/**
 *
 * @author juanc y Gpt
 */
public class Main {
    public static void main(String[] args) {
        MenuFactory vegetarianoFactory = new VegetarianoFactory();
        Menu menuVegetariano = new Menu(vegetarianoFactory);
        menuVegetariano.mostrarMenu();

        MenuFactory saludableFactory = new SaludableFactory();
        Menu menuSaludable = new Menu(saludableFactory);
        menuSaludable.mostrarMenu();

        MenuFactory gourmetFactory = new GourmetFactory();
        Menu menuGourmet = new Menu(gourmetFactory);
        menuGourmet.mostrarMenu();
    }
}