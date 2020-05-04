public enum PlaneType {
    BOEING747(5, 200),
    BOEING787(80, 1300),
    AIRBUSA300(50, 1100),
    LOCKHEED(40, 800);
    private final int capacity, totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }
}
