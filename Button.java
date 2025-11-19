// Clase Abstracta
public abstract class Button {
    
// Atributo privado solo asesible dentro de la clase
    private boolean lit;
// Constructor Boton apagado
    public Button() {
        this.lit = false;
    }
// Constructor (Boton encendido)
    public void lightOn() {
        lit = true;
        System.out.println("El botón se ha encendido.");
    }
// Constructor (Boton encendido)
    public void lightOff() {
        lit = false;
        System.out.println("El botón se ha apagado.");
    }
// Saber si el esta Boton encendido
    public boolean isLit() {
        return lit;
    }
// Metodo abstracto
    public abstract void press();
}