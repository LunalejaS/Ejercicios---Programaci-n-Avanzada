public class Hilo extends Thread {
    String nombre;

    // Constructor: recibe el nombre del hilo (corredor)
    public Hilo(String nombre) {
        this.nombre = nombre;
    }

    // Método que define el comportamiento del hilo (la carrera)
    public void run() {
        // El corredor avanza 30 metros
        for (int c = 1; c <= 30; c++) {
            // Imprime su progreso
            System.out.println("* " + this.nombre + " " + c + " mts");

            // Cede voluntariamente el turno al procesador para permitir que otros hilos avancen
            Thread.yield();
        }

        // Cuando completa los 30 metros, imprime que llegó a la meta
        System.out.println("\n -> Llegó a la meta: " + nombre + "\n");
    }
}
