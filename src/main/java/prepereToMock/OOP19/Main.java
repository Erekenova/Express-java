package prepereToMock.OOP19;

public class Main {
    static void main() {
        CinemaSession cinemaSession = new CinemaSession("Garry Potter",
                10);
        cinemaSession.reserveSeat(1);
        cinemaSession.reserveSeat(2);
        cinemaSession.reserveSeat(3);
        cinemaSession.showCountSeats();
        cinemaSession.cancelReservation(2);
        cinemaSession.showCountSeats();
    }
}
