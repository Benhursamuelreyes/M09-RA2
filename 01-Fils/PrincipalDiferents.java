public class PrincipalDiferents {
    public static void main(String[] args) {
        Fil juan = new Fil("Juan", true, 0);
        Fil pepe = new Fil("Pepe", true, 0);
        pepe.setPriority(Thread.MIN_PRIORITY);
        juan.setPriority(Thread.MAX_PRIORITY);
        pepe.start();
        juan.start();
        System.out.println("Acaba thread main");
    }
}
