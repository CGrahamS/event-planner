public class Event {
  private int mGuests;
  private String mFood;
  private String mBeverage;

  public Event (int guests, String food, String beverages, String entertainment) {
    mGuests = guests;
    mFood = food;
    mBeverage= beverages;
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


}
