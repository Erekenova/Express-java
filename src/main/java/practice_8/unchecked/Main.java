package practice_8.unchecked;

public class Main {
     // 2. Обработка непроверяемого исключения
   // Условие задачи: Напишите метод, который принимает на вход два числа и выполняет их деление. Обработайте ситуацию, когда второе число равно нулю, чтобы избежать исключения при делении.
/*   public static void divide (int a, int b){
       try{
         int result = a / b;
           System.out.println(result);
       }
       catch (ArithmeticException e){
           System.out.println("Ошибка при делении.");
       }
   }

    public static void main(String[] args) {
        divide(10,0);
    }*/
  //  4. Создание и использование собственного непроверяемого исключения
  //  Условие задачи: Напишите функцию, которая принимает строку в качестве аргумента и проверяет, является ли строка правильным электронным адресом. Если строка не удовлетворяет критериям, функция должна выбрасывать непроверяемое исключение.
// alba@mail.com
    public static void validateEmail(String email){
        String regex = "[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        if (!email.matches(regex)){
            throw new InvalidEmailException("Некорректный email!" + email);
        }
        else System.out.println("Корректный email.");
    }

    public static void main(String[] args) {
        try {
            validateEmail("alba-madona@mail.ru");
            validateEmail("345345-34234");
        } catch (InvalidEmailException e)
        {
            System.out.println(e.getMessage());
        }
    }

}
