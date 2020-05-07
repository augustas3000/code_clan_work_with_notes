public enum RankType {

//    When we add an item to our enum, the constructor is
//    called for that item. Since our constructor takes a
//    value we then need to put that value in round brackets
//    after the item we are adding e.g. if we are creating an
//    item in our enum called QUEEN with the value 10 then we would have:
//
//     This means that when we add this item to our enum,
//     it will call the constructor for the enum item QUEEN,
//     passing it the value 10. We can then do the same for the
//     other items in our enum e.g.:

    ACE(14),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13);

    private final int value;

    RankType(int value) {
        this.value = value;
    }


    public int getValue() {
        return this.value;
    }

    //    returns an array of values NOT an array list;
//    SuitType[] suits = SuitType.values();

}
