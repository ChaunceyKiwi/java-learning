import java.lang.reflect.*;

public class ClientWithDynamicProxy  {
  public static void main(String[] args) {
    IVehicle c = new Car("Mercedes");
    ClassLoader c1 = IVehicle.class.getClassLoader();
    IVehicle v = (IVehicle) Proxy.newProxyInstance(c1, new Class[] {IVehicle.class}, new VehicleHandler(c));
    v.start();
    v.forward();
    v.stop();
  }
}