import java.util.Arrays;

public abstract class Point implements mappable {

    private double[] location;

    public Point(String location){
        this.location = mappable.stringToLatLon(location);
    }

    @Override
    public void render() {
        System.out.println("render " + this + " as point (" + getLocation() +")");
    }

    private String getLocation(){
        return Arrays.toString(location);
    }

}
