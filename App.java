import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console console = System.console();

    Cd cdOne = new Cd("John", "CoolTown", 2000, 19);
    Cd cdTwo = new Cd("Sue", "CoolCity", 1995, 10);
    Cd cdThree = new Cd("Larry", "Boring City", 1990, 5);

    List<Cd> allCds = new ArrayList<Cd>();
    allCds.add(cdOne);
    allCds.add(cdTwo);
    allCds.add(cdThree);



    for (Cd individualCd : allCds) {
      System.out.println("-------------------");
      System.out.println(individualCd.mName);
      System.out.println(individualCd.mAlbumName);
      System.out.println(individualCd.mRelease);
      System.out.println(individualCd.mPrice);
    }
  }
}
