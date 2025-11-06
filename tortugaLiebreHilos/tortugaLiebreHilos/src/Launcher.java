public class Launcher {
    static Hilo liebre;
    static Hilo tortuga;
    static Hilo conejo;

    public static void main(String[] args) {
        // Se crean tres corredores con su respectivo nombre
        liebre = new Hilo("Liebre");
        tortuga = new Hilo("Tortuga");
        conejo = new Hilo("Conejo");

        // Se inician los tres hilos de forma concurrente
        liebre.start();
        tortuga.start();
        conejo.start();
    }
}

