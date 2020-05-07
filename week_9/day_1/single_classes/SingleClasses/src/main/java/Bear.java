public class Bear {
//    declare vars outside constructor for them to be accessible
    String name;


//    constructor
    public Bear(String name)
    {

        this.name = name;
    }
//    getter
    public String getName() {
        return this.name;
    }
//    setter
    public void setName(String newName) {
        this.name = newName;
    }

}
