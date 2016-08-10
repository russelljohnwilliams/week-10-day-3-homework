public class EmptySandwich implements Sandwich {

  public String getDescription() {
    // System.out.println("Two Slices of Bread, oh yeah!");
    return "Two Slices Of Bread!";
  }

  public double getCost() {

    System.out.println("Cost of bread: " + 1.50);
    return 1.50;
  }
}

// Implements the sandwich interface with only the required methods from the interface
// Every sandwich made will start as a EmptySandwich

// concrete Component
