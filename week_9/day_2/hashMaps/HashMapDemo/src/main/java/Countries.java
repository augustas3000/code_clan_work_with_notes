import java.util.HashMap;

public class Countries {
    public static void main(String[] args) {

        HashMap<String, Integer> allCountries = new HashMap<String, Integer>();

        allCountries.put("UK", 64100000);
        allCountries.put("Germany", 80620000);
        allCountries.put("France", 66000000);


        System.out.println(allCountries.get("France"));

        System.out.println(allCountries.values());
        System.out.println(allCountries.keySet());
    }

}
