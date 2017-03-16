import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Enter a year, and we will tell you if it's a leap year or not!!");
    Integer year = Integer.parseInt(myConsole.readLine());

    LeapYear leapYear = new LeapYear();
    boolean isLeapYear = leapYear.isLeapYear(year);

    System.out.println("The year you enter is a leap year? " + isLeapYear);

  }
}
