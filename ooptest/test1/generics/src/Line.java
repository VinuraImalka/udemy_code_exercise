import java.util.Arrays;

public abstract class Line implements mappable{

    private double[][] locations;

    public Line(String... places){
        this.locations = new double[places.length][];
        int index = 0;
        for(var l: places){
            this.locations[index++] = mappable.stringToLatLon(l);
        }
    }

    @Override
    public void render() {
        System.out.println("render " + this + " as point (" + getLocation() +")");
    }

    private String getLocation(){
        return Arrays.deepToString(locations);
    }
}
