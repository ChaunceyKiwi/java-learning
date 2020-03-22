public class ClientWithoutProxy  {
  public static void main(String[] args) {
    IVehicle v = new Car("Mercedes");
    v.start();
    v.forward();
    v.stop();
  }
}