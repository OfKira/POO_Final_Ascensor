// Clase Orincipal para ejecutar el programa del ascensor
// Crea el ascensor y un botón de piso, luego simula presionar el botón y mover el ascensor al piso seleccionado
public class Main {

    // Método principal que inicia la ejecución del programa.
    public static void main(String[] args) {
        Elevator elevator = new Elevator();
        FloorButton button = new FloorButton(0);

        button.press();
        elevator.moveToFloor(button.getFloorNumber());
    }
}
