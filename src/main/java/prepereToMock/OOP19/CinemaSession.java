package prepereToMock.OOP19;

import java.util.HashSet;
import java.util.Set;

/*"В системе есть сеанс.

У сеанса есть:
название фильма
общее количество мест
список занятых мест

Нужно реализовать систему, которая может:
забронировать место
отменить бронирование
проверить, занято ли место
показать количество свободных мест

Правила:
одно место можно забронировать только один раз
если место уже занято, бронирование невозможно
при отмене бронирования место снова становится свободным

Пример:
Бронируем места:
1
2
3

Свободных мест:
7

Отменяем бронирование места:
2

Свободных мест:
8"*/
public class CinemaSession {
    private String movieTitle;
    private final int  totalSeats;
    private Set<Integer> reservedSeats = new HashSet<>();

    public CinemaSession(String movieTitle, int totalSeats) {
        this.movieTitle = movieTitle;
        this.totalSeats = totalSeats;
    }
   // забронировать место
    public void reserveSeat(int seatNumber) {
        if (!(isSeatReserved(seatNumber))){
            reservedSeats.add(seatNumber);
            System.out.println("Забронировали место " + seatNumber);

        }
        else System.out.println("Место занято.");
    }
    //отменить бронирование
    public void cancelReservation(int seatNumber){
        if(isSeatReserved(seatNumber)){
            reservedSeats.remove(seatNumber);
            System.out.println("Отменили бронирование " + seatNumber);
        }
        else System.out.println("Место не было забронировано.");
    }
    //проверить, занято ли место
    public boolean isSeatReserved(int seatNumber) {
        return (reservedSeats.contains(seatNumber));
    }
    //показать количество свободных мест
    public void showCountSeats(){
        int size = totalSeats - reservedSeats.size();
        System.out.println("Свободных мест:" +  size);
    }
}
