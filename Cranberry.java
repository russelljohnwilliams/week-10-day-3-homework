public class Cranberry extends fillingDecorator {

    public Cranberry(Sandwich newSandwich) {
        super(newSandwich);
        System.out.println("Adding cranberry");
    }

    public String getDescription(){
        return sandwich.getDescription() + ", cranberry";
    }

    public double getCost(){

        System.out.println("Cost of cranberry: " + .05);
        return sandwich.getCost() + .05;    
    }
}

     // concrete Decorator
