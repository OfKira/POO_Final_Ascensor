// Clase Sensor 
public class Sensor {
    private boolean obstacle;

    // Constructor
    public Sensor() {
        this.obstacle = false;
    }

    // Método para cambiar el estado: si hay obstáculo o no
    public void detectObstacle(boolean obstacleState) {
        this.obstacle = obstacleState;
    }

    // Método para saber si se puede cerrar la puerta
    public boolean canCloseDoor() {
        // Si hay obstáculo, no puede cerrar la puerta
        return !obstacle;
    }
}
