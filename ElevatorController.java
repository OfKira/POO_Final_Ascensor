//Clase para controlar el comportamiento del ascensor,
// recibe las solicitudes de pisos, controla movimiento y puertas.
public class ElevatorController {
    private Elevator elevator;
    private Door door;
    private Sensor sensor;

    public ElevatorController(Elevator elevator, Door door, Sensor sensor) {
        this.elevator = elevator;
        this.door = door;
        this.sensor = sensor;
    }

    //Maneja la solicitud de ir a un piso específico.
    // Mueve el ascensor y controla las puertas según el sensor.
    
    public void requestFloor(int floor) {
        System.out.println("Solicitud de piso: " + floor);
        if (door.isOpen()) {
            System.out.println("Cerrando puerta antes de moverse.");
            cerrarPuertaSegura();
        }

        elevator.moveToFloor(floor);

        System.out.println("Abriendo puerta en piso " + floor);
        door.open();

       
    }

    //Cierra la puerta solo si no hay obstáculos detectados por el sensor.

    public void cerrarPuertaSegura() {
        if (sensor.canCloseDoor()) {
            door.close();
        } else {
            System.out.println("La puerta no se cerró por obstáculo detectado.");
        }
    }
}
