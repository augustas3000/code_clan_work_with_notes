import org.junit.Test;

import java.util.ArrayList;

public class GameHelperTest {

    GameHelper gameHelper = new GameHelper();


    @Test
    public void canPlaceDotComs() {

        ArrayList<String> coords =  gameHelper.placeDotCom(3);
//        System.out.println(coords);
        ArrayList<String> coords2 =  gameHelper.placeDotCom(3);
//        System.out.println(coords);
        ArrayList<String> coords3 =  gameHelper.placeDotCom(3);
//        System.out.println(coords);
    }


}
