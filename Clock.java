import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

class Clock {
  public static void main(String[] args) {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
    LocalDateTime date = LocalDateTime.now();
    String escapeCode = "\033[31m";
    String resetCode = "\033[0m";
    System.out.println("The current " + escapeCode + "time" + resetCode + " is " + dtf.format(date));
  }
}