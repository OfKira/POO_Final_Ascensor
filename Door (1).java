// Clase que representa la puerta del ascensor y controla el estado de la puerta
public class Door {
    private boolean open;
// Constructor que inicia la puerta cerrada
    public Door() {
        this.open = false;
    }
// Abre la puerta e indica que esta abierta
    public void open() {
        open = true;
        System.out.println("Puerta abierta.");
    }
// Cierra la puerta y muestra un mensaje indicando que está cerrada
    public void close() {
        open = false;
        System.out.println("Puerta cerrada.");
    }
// Indica si la puerta está abierta.
    public boolean isOpen() {
        return open;
    }
}