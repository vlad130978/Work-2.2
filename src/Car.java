public class Car extends MotorTransport {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку авто");
    }


    public void checkEngine() {
        System.out.println("Проверяем двигатель авто");
    }
}

