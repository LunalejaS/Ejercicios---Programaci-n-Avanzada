public class Hilo extends Thread {
     // Sobrescritura del método run() que define la tarea del hilo
    public void run() {
        // Ciclo que imprime los números del 1 al 20
        for (int num = 1; num <= 20; num++){
            System.out.println("*" + num + "\n");
            try {
                // Pausa la ejecución del hilo durante 1.5 segundos
                Thread.sleep(1500);
            } catch (InterruptedException e) { // Captura la excepción si el hilo es interrumpido durante el sueño
            }
        }
    }
}