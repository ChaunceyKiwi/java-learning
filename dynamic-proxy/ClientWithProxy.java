public class ClientWithProxy  {
  public static void main(String[] args) {
    IVehicle c = new Car("Mercedes");
    IVehicle v = new VehicleProxy(c);
    v.start();
    v.forward();
    v.stop();
  }
}