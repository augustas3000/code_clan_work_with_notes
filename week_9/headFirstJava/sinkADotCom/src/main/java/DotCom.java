//import all utilities from java package

import java.util.*;
public class DotCom {

//    an array list of cell locations
    private ArrayList<String> locationCells;
//    dotcom's name
    private String name;

//    SETTERS

//    a setter method that update's dotcom's location (random location provided by
//    the GameHelpers placeDotCom() method).
    public void setLocationCells(ArrayList<String> locationCells) {
        this.locationCells = locationCells;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String checkYourself(String userInput) {
        String result = "miss";

//        The array list indexOf method in action. If the user guess is
//        one of the entries in the array list, indexOf will return its array
//        location, if not indexOf will return -1;
        int index = locationCells.indexOf(userInput);

        if (index >= 0) {
//            array list's remove() method to delete an entry.
            locationCells.remove(index);

//            see if all the locations have been guessed with isEmpty ArrayList method.
            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.println("Ohh..! You sunk " + this.name + " :(");
            } else {
                result = "hit";
            }
        }
        return result;
    }

}
