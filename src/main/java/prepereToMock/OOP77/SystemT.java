package prepereToMock.OOP77;

import java.util.ArrayList;
import java.util.List;

public class SystemT {
    List<Transport> transports ;

    public SystemT(List<Transport> transports) {
        this.transports = transports;
    }

    public  void add(Transport transport){
        transports.add(transport);
    }
    public void moveAll(List<Transport> transports){
        for (Transport transport : transports) {
            transport.move();
        }
    }
}
