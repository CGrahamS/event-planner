import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/" (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/event-form" (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/event-form.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine())



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
    System.out.println("Finally, decide what kind of decoration you would like to provide: None, Standard or Deluxe");
    String userDecoration = consoleObj.readLine();

    Event newEvent = new Event(numberOfGuests, userFood, userBeverages, userEntertainment, userDecoration);

    newEvent.calculateCost();
    int guests = newEvent.getGuests();
    String food = newEvent.getFood();
    String beverage = newEvent.getBeverage();
    String entertainment = newEvent.getEntertainment();
    String decoration = newEvent.getDecoration();
    int price = newEvent.getPrice();

    System.out.println("We will serve" + " " + food + " " + "and" + " " + beverage + " " + "beverages" + " " + "for" + " " + guests + " " + "guests" + ".");
    if (!entertainment.equalsIgnoreCase("None") && decoration.equalsIgnoreCase("None")) {
      System.out.println("We will also provide a" + " " + entertainment + ".");
    } else if (!decoration.equalsIgnoreCase("None") && entertainment.equalsIgnoreCase("None")) {
      System.out.println("We will also provide" + " " + decoration + " " + "decorations.");
    } else if (!decoration.equalsIgnoreCase("None") && !entertainment.equalsIgnoreCase("None")) {
      System.out.println("We will also provide a" + " " + entertainment + " " + "and" + " " + decoration + " " + "decorations.");
    }
    System.out.println("Your event will cost:" + " " + "$" + price + ".");
  }
}
