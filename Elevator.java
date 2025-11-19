// Clase que represen o simula un ascensor o elevador controlando su posicion y el subir y bajar entre pisos
public class Elevator {

// Piso actual en el que se encuentra el ascensor
    private int currentFloor;
// Constructor que inicializa el ascensor en el piso 0.
    public Elevator() {
        this.currentFloor = 0;
    }
// Mueve el ascensor hacia el piso indicado, mostrando el paso por cada piso intermedio.
// Si el piso destino es el mismo en el que está, no realiza ningún movimiento.
public void moveToFloor(int floor) {
        System.out.println("Moviendo ascensor al piso " + floor);

        int step = floor > currentFloor ? 1 : -1;

        while (currentFloor != floor) {
            currentFloor += step;
            System.out.println("Ascensor pasando por el piso " + currentFloor);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("El hilo fue interrumpido.");
            }
        }

        System.out.println("Ascensor llegó al piso " + currentFloor);
    }
// Obtiene o establce el piso actual donde se encuentra el ascensor
    public int getCurrentFloor() {
        return currentFloor;
    }
}
