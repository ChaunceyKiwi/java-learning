public class Car implements IVehicle {
  private String name;

  public Car(String name) {this.name = name;}

  public void start() {
    System.out.println("Car "+ getName() + " start");
  }

  public void stop() {
    System.out.println("Car "+ getName() + " stop");
  }

  public void forward() {
    System.out.println("Car "+ getName() + " forward");
  }

  public void reverse() {
    System.out.println("Car "+ getName() + " reverse");
  }

  public String getName() {
    return this.name;
  }
}