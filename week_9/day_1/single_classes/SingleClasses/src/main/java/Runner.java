public class Runner {
    public static void main(String[] args) {
        Bear bear = new Bear("Balu");
//        String name = bear.getName();
//        System.out.println(name);
//
//        bear.setName("Kevin");
//        name = bear.getName();
//        System.out.println(name);

        System.out.println(bear.name);
        bear.name = "Gentle Ben";
        System.out.println(bear.name);
    }
}
