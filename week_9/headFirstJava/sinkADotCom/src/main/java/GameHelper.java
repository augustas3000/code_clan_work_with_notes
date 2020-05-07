import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class GameHelper {

    private static final String alphabet = "abcdefg";
    private int gridLength = 7;
    private int gridSize = 49;

    private int [] grid = new int[gridSize];        //[0,0,0,0,0.....,0]

    private int comCount = 0; //for counting dotComs as these are being placed;



//    method for getting user's input

    public String getUserInput(String prompt) {
        String inputLine = null;

        System.out.println(prompt + " ");
        try{
            BufferedReader is = new BufferedReader (new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0 ) return null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine.toLowerCase();
    }



    //method will return an array list of 'a1' type coords,
    // we use dotComs size in length as argument
    public ArrayList<String> placeDotCom(int comSize) {

        ArrayList<String> alphaCells = new ArrayList<String>(); // 'f6' type coords;

        String temp = null; //temp string for concat
        int[] coords = new int[comSize]; //current candidate coords;
        int attempts = 0; //cuurent attempts counter;
        boolean success = false; // flag = found a good location?
        int location = 0; // current starting location

        comCount++; //nth dot com to place
        int incr = 1; //horizontal increment;
        if ((comCount % 2) == 1) {  //if odd dot com, place vertically, so that direction of every second one changes
            incr = gridLength;      //set vertical increament
        }

        while ( !success & attempts++ < 200 ) {             //main search loop (32)
          location = (int) (Math.random() * this.gridSize);    //get random starting point
            //change this to a set value for debugging;
//            location = 8;
            System.out.println(" try location-" + location );


            int x = 0;                    //nth position in dotCom to place
                success = true;           //assume success
                while (success && x < comSize) { //look for adjacent unused spots
                    if (grid[location] == 0) {
                        coords[x++] = location;  //save location
                        location += incr;        //try next adjacent

//                        the following two ifs will trigger if location is not right
                        if (location >= gridSize) { //out of bound - 'bottom'
                            success = false;        //failure
                        }

                        if (x > 0 && (location % gridLength == 0)) { //out of bounds - right edge
                            success = false;                        //failure
                        }


                    } else  {
//                        this will trigger if location already occupied
                        System.out.println("the location-" + location + " is USED");
                        success = false;
                    }
                }
        }

        int x = 0; //turn location into alpha coords
        int row = 0;
        int column = 0;
        System.out.println("\n");

        while (x < comSize) {
            grid[coords[x]] = 1;    //mark master grid points as used
            row = (int) (coords[x] / gridLength); //get row value;
            column = coords[x] % gridLength; //get numeric column value;
            temp = String.valueOf(alphabet.charAt(column)); //convert to alpha;
            alphaCells.add(temp.concat(Integer.toString(row)));
            x++;
            System.out.println(" coord - " + x + " = " + alphaCells.get(x-1));
        }

        System.out.println("\n");
        return alphaCells;
    }

}
