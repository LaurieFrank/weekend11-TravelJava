public class FlightManager {

    private PlaneType planeType;
    private PlaneType capacity;
    private PlaneType weight;

    public FlightManager(PlaneType capacity, PlaneType weight){
        this.capacity = capacity;
        this.weight = weight;
    }

    public double calculateBaggageWeightPerPassenger() {
        return planeType.getWeight() / planeType.getWeight();
    }

//    public int getAvailableBaggageWeight() {
//        int availableBaggageWeight = (planeType.getCapacity() /2);
//        return availableBaggageWeight;
//    }
}
