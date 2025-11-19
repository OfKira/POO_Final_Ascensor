// Representa un Boton Dentro del ascensor
public class CabinButton extends Button {
// Piso desde la cabina al que queremos ir
    private int targetFloor;
// Constructor
    public CabinButton(int targetFloor) {
        this.targetFloor = targetFloor;
    }
// Inmplementacion de metodo abstracto @override
    @Override
    public void press() {
        lightOn();
        System.out.println("Botón de cabina presionado: Ir al piso " + targetFloor + ".");
    }
// Obtiene el piso destino actual al que se desea mover el ascensor.
    public int getTargetFloor() {
        return targetFloor;
    }
}