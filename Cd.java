class Cd {
  public String mName;
  public String mAlbumName;
  public int mRelease;
  public int mPrice;

  public Cd(String name, String albumName, int release, int price) {
    mName = name;
    mAlbumName = albumName;
    mRelease = release;
    mPrice = price;
  }

  public boolean releaseYear(int year) {
    return (year > mRelease);
  }

  public boolean priceRange(int price) {
    return (price > mPrice);
  }
}
