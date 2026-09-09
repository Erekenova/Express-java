package prepereToMock.LiveCode1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        List<Sock> socks = new ArrayList<>(List.of(
                new Sock("Высокий", "Красный"),
                new Sock("Низкий", "Красный"),
                new Sock("Высокий", "Черный"),
                new Sock("Высокий", "Зеленый"),
                new Sock("Низкий", "Красный")));
        for (int i = 0; i < socks.size(); i++) {
            Sock sock = socks.get(i);
            for (int j = i + 1; j < socks.size(); j++) {
                Sock sock1 = socks.get(j);

                if (sock.getType().equals(sock1.getType()) && sock.getColour().equals(sock1.getColour()) ) {
                    System.out.println(socks.get(i)+ " "  + socks.get(j));
                }


            }

        }
    }


}
