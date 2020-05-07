import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordCollectionTest {

    private WordCollection myWords;

    @Before
    public void before() {
        myWords = new WordCollection();
    }

    @Test
    public void canGetWordCount() {
        assertEquals(0, myWords.getWordCount());

//        [null, null, null, null, null] - as we dint specify what we want to fill it with
    }

//
//    public static void main(String[] args) {
//
//    }

}
