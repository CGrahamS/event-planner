public class Event {
  private int mGuests;
  private String mFood;
  private String mBeverage;
  private String mEntertainment;
  private String mDecoration;
  private int mPrice;

  public Event(int guests, String food, String beverages, String entertainment, String decoration) {
    mGuests = guests;
    mFood = food;
    mBeverage = beverages;
    mEntertainment = entertainment;
    mDecoration = decoration;
    mPrice = 0;
  }

  public int getGuests() {
    return mGuests;
  }

  public String getFood() {
    return mFood;
  }

  public String getBeverage() {
    return mBeverage;
  }

  public String getEntertainment() {
    return mEntertainment;
  }

  public String getDecoration() {
    return mDecoration;
  }

  public int getPrice() {
    return mPrice;
  }

  public int calculateCost() {

    if (mFood.equalsIgnoreCase("Light Refreshments")) {
      mPrice += (3 * mGuests);
    } else if (mFood.equalsIgnoreCase("Hors d'oevures")) {
      mPrice += (5 * mGuests);
    } else if (mFood.equalsIgnoreCase("Full Meal")) {
      mPrice += (20 * mGuests);
    }
    if (mBeverage.equalsIgnoreCase("Non-Alcoholic")) {
      mPrice += (5 * mGuests);
    } else if (mBeverage.equalsIgnoreCase("Beer & Wine")) {
      mPrice += (20 * mGuests);
    } else if (mBeverage.equalsIgnoreCase("Full Bar")) {
      mPrice += (45 * mGuests);
    }
    if (mEntertainment.equalsIgnoreCase("None")) {
      mPrice += 0;
    } else if (mEntertainment.equalsIgnoreCase("DJ")) {
      mPrice += 150;
    } else if (mEntertainment.equalsIgnoreCase("Live Band")) {
      mPrice += 500;
    }
    if (mDecoration.equalsIgnoreCase("None")) {
      mPrice += 0;
    } else if (mDecoration.equalsIgnoreCase("Standard")) {
      mPrice += (2 * mGuests);
    } else if (mDecoration.equalsIgnoreCase("Deluxe")) {
      mPrice += (5 * mGuests);
    }
    return mPrice;
  }

}
