import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console consoleObj = System.console();

    System.out.println("Welcome to Event Horizon Planning!");
    System.out.println("See the beauty of your event, without being sucked into the black hole of planning.");
    System.out.println("First, decide how many guests you expect: ");
    int numberOfGuests = Integer.parseInt(consoleObj.readLine());
    System.out.println("Second, decide what type of food you would like to provide: Light Refreshments, Hors d'oevures or Full Meal");
    String userFood = consoleObj.readLine();
    System.out.println("Third, decide what type of beverages you would like to provide: Non-Alcoholic, Beer & Wine or Full Bar");
    String userBeverages = consoleObj.readLine();
    System.out.println("Fourth, decide what kind of entertainment you would like to provide: None, DJ or Live Band");
    String userEntertainment = consoleObj.readLine();
    System.out.println("Finally, decide what kind of decoration you would like to provide: Standard");
  }
}
