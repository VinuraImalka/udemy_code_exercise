public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        var nationalUSParks = new Park[]{
                new Park("1","22,33"),
                new Park("2","44,55")
        };

        Layer<Park> parkLayer = new Layer<>(nationalUSParks);
        parkLayer.renderLayer();

        var Rivers = new River[]{
                new River("3","23,453","42,31","456,8","32,54"),
                new River("4","55,3","411,31","6,8555","9,5324"),
        };

        Layer<River> riverLayer = new Layer<>(Rivers);
        riverLayer.addElement(new River("6","53133,3114","1,331","555,9","93232,4"));
        riverLayer.renderLayer();
    }
}