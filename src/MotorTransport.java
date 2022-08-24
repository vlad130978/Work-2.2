public abstract class MotorTransport extends Transport implements CheckInterface {
    public MotorTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


    abstract public void checkEngine();


    @Override
    public void check() {
        checkEngine ();
    }
}


