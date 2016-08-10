public class Bacon extends fillingDecorator {

    public Bacon(Sandwich newSandwich) {
        super(newSandwich);
        System.out.println("Adding Bacon");
    }

    public String getDescription(){
        return sandwich.getDescription() + ", Bacon";
    }

    public double getCost(){

        System.out.println("Cost of Bacon: " + .75);
        return sandwich.getCost() + .75;    
    }
}


// Returns the result of calling getDescription() for EmptySandwich and adds " Bacon" to it
     // concrete Decorator
