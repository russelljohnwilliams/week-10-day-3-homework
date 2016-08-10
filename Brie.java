public class Brie extends fillingDecorator {

    public Brie(Sandwich newSandwich) {
        super(newSandwich);
        System.out.println("Adding Brie");
    }

    public String getDescription(){
        return sandwich.getDescription() + ", Brie";
    }

    public double getCost(){

        System.out.println("Cost of Brie: " + .50);
        return sandwich.getCost() + .50;    
    }
}

     // concrete Decorator
