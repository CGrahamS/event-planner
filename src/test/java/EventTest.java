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
  public void getBeverage_getsBeverage_NonAlcholic() {
    Event testEvent = new Event(10, "Light Refreshment", "Non-Alcoholic", "None");
    assertEquals("Non-Alcoholic", testEvent.getBeverage());
  }

  @Test
  public void getEntertainment_getsEntertainment_None() {
    Event testEvent = new Event(10, "Light Refreshment", "Non-Alcoholic", "None");
    assertEquals("None", testEvent.getEntertainment());
  }

  @Test
  public void  calculateCost_calculatesCostOfEvent_80() {
    Event testEvent = new Event(10, "Light Refreshment", "Non-Alcoholic", "None");
    assertEquals(80, testEvent.calculateCost());
  }

  @Test
  public void calculateCost_calculatesCostOfEvent_1400() {
    Event testEvent = new Event(50, "Hors d'oevures", "Beer & Wine", "DJ");
    assertEquals(1400, testEvent.calculateCost());
  }

  @Test
  public void calculateCost_calculatesCostOfEvent_7000() {
    Event testEvent = new Event(100, "Full Meal", "Full Bar", "Live Band");
    assertEquals(7000, testEvent.calculateCost());
  }
}
