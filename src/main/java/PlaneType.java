public enum PlaneType {
    BOEING747(1000, 524),
    BOEING_BBJ_MAX_7(100, 600);


    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight){
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int getWeight(){
        return this.weight;
    }

}
