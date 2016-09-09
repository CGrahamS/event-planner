import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
  public void newEvent_instantiatesCorrectly() {
    Event testEvent = new Event(10, "Light Refreshment", "Non-Alcoholic", "None");
    assertEquals(true, testEvent instanceof Event);
  }

  @Test
  public void getGuests_getsGuests_10() {
    Event testEvent = new Event(10, "Light Refereshment", "Non-Alcholic", "None");
    assertEquals(10, testEvent.getGuests());
  }

  @Test
  public void getFood_getsFood_LightRefreshment() {
    Event testEvent = new Event(10, "Light Refreshment", "Non-Alcoholic", "None");
    assertEquals("Light Refreshment", testEvent.getFood());
  }

  @Test
  public void getBeverages_getsBeverage_NonAlcholic() {
    Event testEvent = new Event(10, "Light Refreshment", "Non-Alcoholic", "None");
    assertEquals("Non-Alcoholic", testEvent.getBeverage());
  }
}
