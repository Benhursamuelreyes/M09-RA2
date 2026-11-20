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
    public static void main(String[] args) {
        String[] jogadors ["Messi", "Cristiano Ronaldo", "Lewandowski", "Lamine Yamal", "Harry Kane", "Mbappe","Raphinha", "Haaland", "Dembele","Neimar", "David suazo"];
        
    }
}
