public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen (){
        brewMaster = new CoffeeMaker();
        dishWasher = new DishWasher();
        iceBox = new Refrigerator();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void setKitchenState(boolean coffeeFlag,boolean fridgeFlag, boolean dishWasherFlag){
        brewMaster.setHasWorkToDo(coffeeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
        iceBox.setHasWorkToDo(fridgeFlag);
    }

    public void doKitchenWork(){
        brewMaster.brewCoffee();
        dishWasher.doDishes();
        iceBox.orderFood();
    }
}

class CoffeeMaker {
    private boolean hasWorkToDo;
    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }
    public void  pourMilk(){
        setHasWorkToDo(true);
    }
    public void brewCoffee(){
        if(hasWorkToDo){
            System.out.println("brewing coffee");
            hasWorkToDo = false;
        }
    }
}

class Refrigerator {
    private boolean hasWorkToDo;
    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }
    public void  addWater(){
        setHasWorkToDo(true);
    }

    public void orderFood(){
        if(hasWorkToDo){
            System.out.println("ordering food");
            hasWorkToDo = false;
        }
    }
}

class DishWasher {
    private boolean hasWorkToDo;
    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }
    public void  loadDishWasher(){
        setHasWorkToDo(true);
    }

    public void doDishes(){
        if(hasWorkToDo){
            System.out.println("doing dishes");
            hasWorkToDo = false;
        }
    }
}

