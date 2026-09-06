package prepereToMock.OOP1;

import java.util.List;

/*"Система работает с разными типами сотрудников:

сотрудник с фиксированным окладом
сотрудник с почасовой оплатой
сотрудник с процентом от продаж

У каждого сотрудника есть имя.

Правила расчета зарплаты:
У каждого сотрудника в засимости от типа есть поля:
для фиксированная зарплата — месячный оклад
для почасовая — количество часов × ставка
для процентная — процент × сумма продаж

Нужно реализовать систему, которая может выплатить зарплату всем сотрудникам.

Требование:

Метод, который выплачивает зарплату, должен работать со списком сотрудников, не зная их конкретный тип.
Каждый тип сотрудника должен сам рассчитывать свою зарплату.

Метод должен вывести:
Анна получила 3000
Борис получил 2400
Мария получила 5000"*/
public class SalaryService {
    public static void paySalaries(List<Employee> employees){
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " получил " + employee.paySalary());
        }
    }
    static void main() {
        List<Employee> employees = List.of(
                new FixedSalaryEmployee("Anna", 3000),
                new HourlyEmployee("Boris",160,15),
                new CommissionEmployee("Arina", 10,50000));
        paySalaries(employees);
    }
}
