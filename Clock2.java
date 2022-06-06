import java.time.LocalDateTime;

class Clock2 {
  public static void main(String[] args) {
    LocalDateTime date = LocalDateTime.now();
    String escapeCode = "\033[31m";
    String resetCode = "\033[0m";
    System.out.printf("The current " + escapeCode + "time" + resetCode + " is " + "%1$tH:%1$tM \n", date);
  }
}