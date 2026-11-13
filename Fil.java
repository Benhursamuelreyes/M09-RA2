public class Fil {
    static class Hilo extends thread {
        public Hilo(String nom) { super(nom) }
        @Override public void run() {
            for (int i = 0; i <= 100; i++) System.out.println(getName()+" "+i);
            System.out.println("Acaba " + getName());
        }
    }
}