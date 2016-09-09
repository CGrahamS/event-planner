public class Event {
  private int mGuests;
  private String mFood;

  public Event (int guests, String food, String beverages, String entertainment) {
    mGuests = guests;
    mFood = food;
  }

  public int getGuests() {
    return mGuests;
  }

  public String getFood() {
    return mFood;
  }

}
