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
    System.out.println("Welcome! Please select from the options: See all Cds, Search by Album Date, Search by price, Search by artist, Add a CD, Enter coupon, Exit");
    String userInput = console.readLine();

    boolean promgramRunning = true;
    while(promgramRunning){
      if (userInput.equals("See all Cds")) {
        for (Cd individualCd : allCds) {
          System.out.println("-------------------");
          System.out.println(individualCd.mName);
          System.out.println(individualCd.mAlbumName);
          System.out.println(individualCd.mRelease);
          System.out.println(individualCd.mPrice);
        }
      } else if (userInput.equals("Search by Album Date")) {
          System.out.println("Enter album year to show everything before that year");
          int userYear = Integer.parseInt(console.readLine());
          for (Cd individualCd : allCds ) {
            if (individualCd.releaseYear(userYear)){
              System.out.println("-------------------");
              System.out.println(individualCd.mName);
              System.out.println(individualCd.mAlbumName);
              System.out.println(individualCd.mRelease);
              System.out.println(individualCd.mPrice);
            }
          }
      } else if (userInput.equals("Search by price")) {
        System.out.println("Enter amount to search for albums under that amount.");
        int userPrice = Integer.parseInt(console.readLine());
        for (Cd individualCd : allCds) {
          if (individualCd.priceRange(userPrice)) {
            System.out.println("-------------------");
            System.out.println(individualCd.mName);
            System.out.println(individualCd.mAlbumName);
            System.out.println(individualCd.mRelease);
            System.out.println(individualCd.mPrice);
          }
        }
      } else if(userInput.equals("Search by artist")) {
        System.out.println("Enter artist name you are looking for");
        String userArtist = console.readLine();
        for (Cd individualCd : allCds) {
          if (individualCd.artistName(userArtist)) {
            System.out.println("-------------------");
            System.out.println(individualCd.mName);
            System.out.println(individualCd.mAlbumName);
            System.out.println(individualCd.mRelease);
            System.out.println(individualCd.mPrice);
          }
        }
      } else if (userInput.equals("Add a CD")) {
        System.out.println("Let's add a CD! What is the artist's name?");
        String userArtistName = console.readLine();
        System.out.println("I like that artist, which album is it?");
        String userAlbumName = console.readLine();
        System.out.println("Great album. When was it released?");
        int userRelease = Integer.parseInt(console.readLine());
        System.out.println("I love that year, how much does this cd cost?");
        int userPrice = Integer.parseInt(console.readLine());
        Cd userCd = new Cd(userArtistName, userAlbumName, userRelease, userPrice);
        allCds.add(userCd);
        System.out.println("Here is your CD");
          System.out.println("-------------------");
          System.out.println(userCd.mName);
          System.out.println(userCd.mAlbumName);
          System.out.println(userCd.mRelease);
          System.out.println(userCd.mPrice);
      } else if (userInput.equals("Exit")) {
        promgramRunning = false;
      } else if (userInput.equals("Enter coupon")) {
        System.out.println("Enter Coupon Code");
        String userCoupon = console.readLine();
        if (userCoupon.equals("deal10")) {
          for (Cd individualCd : allCds) {
              System.out.println("-------------------");
              System.out.println(individualCd.mName);
              System.out.println(individualCd.mAlbumName);
              System.out.println(individualCd.mRelease);
              System.out.println("Discounted Price: " + individualCd.discountTen());
          }
        } else if (userCoupon.equals("deal20")) {
          if (userCoupon.equals("deal20")) {
            for (Cd individualCd : allCds) {
                System.out.println("-------------------");
                System.out.println(individualCd.mName);
                System.out.println(individualCd.mAlbumName);
                System.out.println(individualCd.mRelease);
                System.out.println("Discounted Price: " + individualCd.discountTwenty());
            }
          }
        } else if (userCoupon.equals("deal30")) {
          if (userCoupon.equals("deal30")) {
            for (Cd individualCd : allCds) {
                System.out.println("-------------------");
                System.out.println(individualCd.mName);
                System.out.println(individualCd.mAlbumName);
                System.out.println(individualCd.mRelease);
                System.out.println("Discounted Price: " + individualCd.discountThirty());
            }
          }
        }
      }
    }
  }
}
