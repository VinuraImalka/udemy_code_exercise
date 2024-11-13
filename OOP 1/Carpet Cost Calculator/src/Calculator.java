public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator (Floor floor,Carpet carpet){
        setCarpet(carpet);
        setFloor(floor);
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    public void setCarpet(Carpet carpet) {
        this.carpet = carpet;
    }

    public double getTotalCost(){
        return (floor.getArea()*carpet.getCost());
    }
}
