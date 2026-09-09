package prepereToMock.LiveCode1;

import java.util.Objects;

public class Sock {
private String type;
private String colour;

    public Sock(String type, String colour) {
        this.type= type;
        this.colour = colour;
    }

    public String getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Sock sock = (Sock) o;
        return Objects.equals(type, sock.type) && Objects.equals(colour, sock.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, colour);
    }

    @Override
    public String toString() {
        return "Sock{" +
                "type='" + type + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
