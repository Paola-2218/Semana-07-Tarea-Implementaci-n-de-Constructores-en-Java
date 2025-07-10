// Clase que representa a una persona con atributos encapsulados
public class Persona {
    // Atributos privados
    private String nombre;
    private int edad;

    // Constructor por defecto
    public Persona() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        System.out.println("Constructor por defecto ejecutado.");
    }

    // Constructor parametrizado
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        System.out.println("Constructor parametrizado ejecutado.");
    }

    // Sobrecarga de constructor con solo nombre
    public Persona(String nombre) {
        this.nombre = nombre;
        this.edad = 18; // Valor por defecto
        System.out.println("Constructor con solo nombre ejecutado.");
    }

    // Métodos getter
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // Método para mostrar información de la persona
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " | Edad: " + edad);
    }
}
