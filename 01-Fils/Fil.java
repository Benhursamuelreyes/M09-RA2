

public class Fil extends Thread {
    private boolean conTrabajo;
    private long pausaMs;
    private long resultado;
    public Fil(String nom, boolean conTrabajo, long pausaMs) {
        super(nom);
        this.conTrabajo = conTrabajo;
        this.pausaMs = pausaMs;
    }
    @Override public void run() {
        long gastaCPU = 0;
        for (int i = 1; i <= 9; i++) {
            if (conTrabajo == true) {
                for (int j = 0; j < 1000; j++) {
                    gastaCPU += j;
                }
            }
            if (pausaMs > 0) {
                try {
                    Thread.sleep(pausaMs);
                } catch (InterruptedException e) {
                    System.err.println(getName() + " interrumpido");
                    interrupt();
                    return;
                }
            }
            System.out.println(getName() + " " + i);
        }
       resultado = gastaCPU;
        System.out.println("Acaba el fil " + getName());
    }
}