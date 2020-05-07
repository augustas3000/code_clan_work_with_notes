import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {
//        create a new empty hashmap
        HashMap<String, String> favouriteFruits = new HashMap<String, String>();

//        keys dont have to be strings but 9/10 will be,
//
        favouriteFruits.put("Alice", "Apple");
        favouriteFruits.put("Sarah", "Nana");
        favouriteFruits.put("Bob", "Strawberry");

//    wanna inser ta new entry use puts !
//    wanna get a value back, use get("key") !
//    return the size of a HashMap as int:
//    int = fruitsSize = favouriteFruits.size(),
//    clear - we use clear
//    does the HashMap contain a given value?
//    boolean hasKiwi = favouriteFruits.containsValue("Kiwi");
//    contains a givenven key?
//    boolean hasGus = favouriteFruits.containsKey("Key");
//    remove a pair from hashmap:
//    favFruits.remove("key);



        System.out.println(favouriteFruits.get("Sarah"));
    }
}
