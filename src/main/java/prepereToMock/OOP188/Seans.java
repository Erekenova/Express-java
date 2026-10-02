package prepereToMock.OOP188;

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
public class Seans {

    private String title;
    private int countSeats;
    private Set<Integer> reserverSeats = new HashSet<>();

    public Seans(String title, int countSeats) {
        this.title = title;
        this.countSeats = countSeats;
    }
    //забронировать место
    public void reservedSeat(int seat){
        if(isReserveSeat(seat)){
            System.out.println("Место " + seat + " уже занято!");
        } else {
        reserverSeats.add(seat);
        System.out.println("Место " + seat + " забронировано");
        }
    }
    //отменить бронирование
    public void cancelReservation(int seat){
        if(isReserveSeat(seat)){
            System.out.println("Отменяем бронирование " + seat);
            reserverSeats.remove(seat);
        }
        else System.out.println("Место не было забронировано");
    }
    //проверить, занято ли место
    public boolean isReserveSeat(int seat){
       return reserverSeats.contains(seat);
    }
    //Количество свободных мест
    public void calculateFreeSeats(){
        System.out.println("Свободных мест");
        System.out.println(countSeats - reserverSeats.size());
    }
}
