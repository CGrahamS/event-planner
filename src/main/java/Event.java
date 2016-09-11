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

  String[] foodSelectionArray = {"Light Refreshments", "Hors d'oevures", "Full Meal"};
  int[] foodPriceArray = {3, 5, 20};
  String[] beverageSelectionArray = {"Non-Alcoholic", "Beer & Wine", "Full Bar"};
  int[] beveragePriceArray = {5, 20, 45};
  String[] entertainmentSelectionArray = {"None", "DJ", "Live Band"};
  int[] entertainmentPriceArray = {0, 150, 500};
  String[] decorationSelectionArray = {"None", "Standard", "Deluxe"};
  int[] decorationPriceArray = {0, 2, 5};

  public int calculateCost() {

    for (int i = 0; i < foodSelectionArray.length; i++) {
      if (mFood.equalsIgnoreCase(foodSelectionArray[i])) {
        mPrice += (foodPriceArray[i] * mGuests);
      }
    }

    for (int i = 0; i < beverageSelectionArray.length; i++) {
      if (mBeverage.equalsIgnoreCase(beverageSelectionArray[i])) {
        mPrice += (beveragePriceArray[i] * mGuests);
      }
    }

    for (int i = 0; i < entertainmentSelectionArray.length; i++) {
      if(mEntertainment.equalsIgnoreCase(entertainmentSelectionArray[i])) {
        mPrice += entertainmentPriceArray[i];
      }
    }

    for (int i = 0; i < decorationSelectionArray.length; i++) {
      if(mDecoration.equalsIgnoreCase(decorationSelectionArray[i])) {
        mPrice += (decorationPriceArray[i] * mGuests);
      }
    }
    return mPrice;
  }
}
