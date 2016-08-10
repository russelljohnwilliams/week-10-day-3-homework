public class SandwichMaker {

  public static void main(String[] args){

    Sandwich sandwich = new Bacon(new Brie( new Cranberry(new EmptySandwich())));

    System.out.println("Ingredients: " + sandwich.getDescription());

    System.out.println("Price: " + sandwich.getCost());
  }
}


// The EmptySandwich object is sent to the Bacon constructor, the Brie constructor and then to the Cranberry constructor... Lets hope they pop it under the grill!!!

