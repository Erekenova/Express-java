package practice_5.task_6;
/*Условие:
В ботаническом саду содержится одно растение.
У разных растений — разные требования к уходу.
Примеры:
Орхидея — высокая влажность и тень
Кактус — много света, редкий полив
Нужно спроектировать систему, в которой можно добавить растение и обеспечить нужный уход.*/
public class Main {
    public static void main(String[] args) {
        Plant cactus = new Cactus();
        Plant orchid = new Orchid();
        BotanicalGarden sgtu = new BotanicalGarden();
        sgtu.add(cactus);
        sgtu.care();

        sgtu.add(orchid);
        sgtu.care();

    }
}
