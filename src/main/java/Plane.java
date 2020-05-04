public class Plane {

    private PlaneType planeType;

    public Plane(PlaneType type){
        this.planeType = type;
    }

    public PlaneType getPlaneType(){
        return this.planeType;
    }

    public int getPlaneWeight() {
        return this.planeType.getTotalWeight();
    }

    public int getPlaneCapacity() {
        return this.planeType.getCapacity();
    }

    public int getPlaneHoldWeight(){
        return this.planeType.getTotalWeight() / 2;
    }
}
