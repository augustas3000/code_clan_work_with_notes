public class Runner {
    public static void main(String[] args) {
        Planet pluto = new Planet("Pluto", 99);

        System.out.println(pluto.getName() + " is of size: " + pluto.getSize());
        System.out.println(pluto.explode());
    }
}
