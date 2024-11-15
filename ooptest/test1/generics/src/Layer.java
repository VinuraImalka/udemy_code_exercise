import java.util.ArrayList;
import java.util.List;

public class Layer<T extends mappable> {

    private List<T> layerElements;

    public Layer(T[] layerElements) {
        this.layerElements = new ArrayList<T>(List.of(layerElements));
    }

    public void addElement(T... elements){
        layerElements.addAll(List.of(elements));
    }


    public void renderLayer(){
        for(T element : layerElements){
            element.render();
        }
    }
}
