abstract class fillingDecorator implements Sandwich {
 
    protected Sandwich sandwich;
     
    public fillingDecorator(Sandwich sandwich){
        this.sandwich = sandwich;
    }
     
    public String getDescription() {
        return sandwich.getDescription();
    }
 
    public double getCost() {
        return sandwich.getCost();
    }
}


// This is an Aggregation Relationship

// Assigns the type instance to this attribute of a sandwich

// All decorators can dynamically customize the sandwich instance EmptySandwich because of this
     
     // Decorator
