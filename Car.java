public class Car {
    String brand;

    public static void main(String[] args) {
      
        Car car1 = new Car();
        Car car2 = new Car();

        car1.brand = "Toyota";
        car2.brand = "Honda";

        System.out.println("Car 1 Brand: " + car1.brand);
        System.out.println("Car 2 Brand: " + car2.brand);
    }
}