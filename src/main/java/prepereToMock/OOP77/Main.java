package prepereToMock.OOP77;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
       List<Transport>  transports = new ArrayList<>();
        transports.add(new Car("Tesla"));
        transports.add(new Bycical("BMX"));
        transports.add(new Plane("Boeing"));
        SystemT system = new SystemT(transports);
        system.moveAll(transports);
    }
}
