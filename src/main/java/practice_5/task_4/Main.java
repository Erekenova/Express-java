package practice_5.task_4;
/*4. Аквариум
Условие:
В аквариуме может находиться одно морское существо.
В зависимости от существа, оно ведёт себя по-разному.
Примеры:
Акула плавает быстро и агрессивно
Морская звезда медленно ползает
Нужно спроектировать систему, в которой можно добавить существо и продемонстрировать его поведение.
Сущности, Свойства и действия:
Аквариум добавить существо, показать поведение
морская звезда - ползает, медленная
акула - плавает, быстрая
морские существа
*/

public class Main {
    public static void main(String[] args) {
        SeaAnimal star = new Star();
        Aquarium aquarium = new Aquarium();
        aquarium.add(star);
        aquarium.showBehavior();

        SeaAnimal shark = new Shark();
        aquarium.add(shark);
        aquarium.showBehavior();
    }




}
