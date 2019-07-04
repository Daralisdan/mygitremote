package daralisdan;

public class Test3 {
  public static void main(String[] args) {
    String DriverName = "老张";
    String Car = "车";
    String Address = "东北";
    go(DriverName, Car, Address);
  }
  public static void go(String DriverName,String Car,String Address) {
    System.out.println(DriverName + "开" + Car + "去" + Address);
  }
}
