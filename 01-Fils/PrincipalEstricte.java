public class PrincipalEstricte {
    public static void main(String[] args) {
        Fil juan = new Fil("Juan", false, 1);
        Fil pepe = new Fil("Pepe", false, 1);
        juan.start();
        pepe.start();
        System.out.println("Acaba thread main");
    }
}
