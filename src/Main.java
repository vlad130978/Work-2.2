public class Main {
    public static void main(String[] args) {
        CheckInterface car = new Car("car1", 4);
        CheckInterface[] checkableTransports = new CheckInterface[]{
                new Car("car2", 4),
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2),
                new Truck("truck1", 6),
                new Truck("truck2", 8)
        };
        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(checkableTransports);
    }
}
