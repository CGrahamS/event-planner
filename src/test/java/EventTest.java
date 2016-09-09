import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
  public void newEvent_instantiatesCorrectly() {
    Event testEvent = new Event(10, "Light Refreshment", "Non-Alcoholic", "None");
    assertEquals(true, testEvent instanceof Event);
  }

  @Test
  public void getGuests_getGuests_10() {
    Event testEvent = new Event(10, "Light Refereshment", "Non-Alcholic", "None");
    assertEquals(10, testEvent.getGuests());
  }
}
