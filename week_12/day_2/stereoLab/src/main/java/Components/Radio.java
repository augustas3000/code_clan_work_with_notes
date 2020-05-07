package Components;

public class Radio extends Component {

    public Radio(String name, String make, String model) {
        super(name, make, model);
    }

    public String tune(String radioStation) {
        return "The radio is now tuned to " + radioStation + " enjoy listening!";
    }

}
