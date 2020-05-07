public class WordCollection {
//    private inst var which is an aaray of strings called words
    private String[] words;

    public WordCollection() {
        this.words = new String[5];
    }

    public int getWordCount() {
        return this.words.length;
    }

    public void add(String word) {
        this.words[0] = word;
    }
}
