//Botón de piso, heredada de Button.
// clase que representa un boton de piso en el ascensor

public class FloorButton extends Button {

    // Número del piso asociado al botón. 
    private int floorNumber;

    public FloorButton(int floorNumber) {
        this.floorNumber = floorNumber;
    }
    
    //Método que se llama cuando se presiona el botón.
    // Enciende la luz y muestra un mensaje indicando el piso seleccionado
    @Override
    public void press() {
        lightOn();
        System.out.println("Botón de piso presionado: Piso " + floorNumber);
    }
// Obtiene el número del piso asociado a este botón.
// @return Número del piso
    public int getFloorNumber() {
        return floorNumber;
    }
}
