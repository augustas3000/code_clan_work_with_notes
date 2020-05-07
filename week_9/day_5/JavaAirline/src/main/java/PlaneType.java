import java.util.ArrayList;

public enum PlaneType {

    BOEING737(320,65000,6400),
    AEA_EXPLORER(270,60000, 5400);

    private final int capacity;
    private final int totalWeight;
    private final int totalBaggageAllowance;

    PlaneType(int capacity, int totalWeight, int totalBaggageAllowance) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
        this.totalBaggageAllowance = totalBaggageAllowance;

    }


//    getters
    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public int getTotalBaggageAllowance() {
        return totalBaggageAllowance;
    }
}
