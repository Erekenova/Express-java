package prepereToMock.OOP188;

public class Main {
    static void main() {
        Seans seans = new Seans("Гарри Поттер", 10);
        seans.reservedSeat(1);
        seans.reservedSeat(2);
        seans.reservedSeat(3);

        seans.calculateFreeSeats();

        seans.cancelReservation(2);

        seans.calculateFreeSeats();
    }


}
