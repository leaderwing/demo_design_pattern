import facade.CheckInFacade;
import java.util.Date;

public class ClientMain {

  public static void main(String[] args) {
    System.out.println("demo facade design pattern!");
    CheckInFacade facade = CheckInFacade.getInstance();
    facade.putLog(new Date());
    System.out.println("finish put log function!");
  }
}
