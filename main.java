// Clase principal que crea instancias de Persona
public class Main {
    public static void main(String[] args) {
        // Uso del constructor por defecto
        Persona persona1 = new Persona();
        persona1.mostrarInfo();

        // Uso del constructor parametrizado
        Persona persona2 = new Persona("Ana", 25);
        persona2.mostrarInfo();

        // Uso de la sobrecarga del constructor
        Persona persona3 = new Persona("Carlos");
        persona3.mostrarInfo();
    }
}
