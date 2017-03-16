import org.junit.*;
import static org.junit.Assert.*;

public class LeapYearTest {

  @Test
  public void isLeapYear_forNumberDivisibleByFour_true() {

    // What does this do again? An instance of LeapYear class...
    LeapYear leapYear = new LeapYear();

    //compares true to (year 2012 passed to "isLeapYear" in other java file). For FAILING TEST, return false vs true.
    assertEquals(true, leapYear.isLeapYear(2012));
   }

   @Test
   public void isLeapYear_forNumbersNotDivisibleByFour_false(){
    LeapYear leapYear = new LeapYear();
    assertEquals(false, leapYear.isLeapYear(1999));
  }

  @Test
  public void isLeapYear_forMultiplesOfOneHundred_false() {
    LeapYear leapYear = new LeapYear();
    assertEquals(false, leapYear.isLeapYear(1900));
  }

  @Test
  public void isLeapYear_forMultiplesOfFourHundred_false() {
    LeapYear leapYear = new LeapYear();
    assertEquals(true, leapYear.isLeapYear(1600));
  }



}
