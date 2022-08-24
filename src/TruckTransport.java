public abstract class TruckTransport extends MotorTransport implements CheckInterface {
    public TruckTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }



    abstract public void checkTrailer();
}


