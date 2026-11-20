public class Futbolista extends Thread {
    private int ngols;
    private int ntirades;
    private static final int NUM_JUGADORS = 11;
    private static final int NUM_TIRADES = 20;
    private static final float PROBABILITAT = 0.5f;

    public Futbolista(String nom) {
        super(nom);
        this.ngols = 0;
        this.ntirades = 0;
    }
    
    @Override public void run() {
        for (int i = 1; i <= NUM_TIRADES; i++) {
            if (Math.random() < PROBABILITAT) {
                ngols++;
            }
            ntirades++;
        }
    }
    public static void main(String[] args) throws InterruptedException {
        String[] noms = {"Messi", "Cristiano Ronaldo", "Lewandowski", "Lamine Yamal", "Harry Kane", "Mbappe","Raphinha", "Haaland", "Dembele","Neymar", "David suazo"};
        Futbolista[] jugadors = new Futbolista[NUM_JUGADORS];

        for (int i = 0; i < NUM_JUGADORS; i++) {
            jugadors[i] = new Futbolista(noms[i]);
        }
        System.out.println("Inici dels xuts --------------------");
        for (Futbolista j : jugadors) {
           j.start();
        }
        for (Futbolista k : jugadors) {
            k.join();
        }
        System.out.println("Fi dels xuts -----------------------");
        System.out.println("--- Estadístiques ------");
        for (Futbolista f : jugadors) {
        System.out.printf("%-18s -> %2d gols%n", f.getName(), f.ngols);
        }
    }
}