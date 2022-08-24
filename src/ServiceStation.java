public class ServiceStation {
    public void check(CheckInterface checkableTransport) {
        checkableTransport.check();
    }

    public void check(CheckInterface[] transports) {
        for (CheckInterface transport : transports) {
            check(transport);
        }
    }
}
