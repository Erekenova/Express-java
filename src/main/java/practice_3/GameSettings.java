package practice_3;

public class GameSettings {
    static int maxPlayers = 10;
    final String gameName;
    int currentPlayers;

    GameSettings(String gameName) {
        this.gameName = gameName;
        this.currentPlayers = 0;
    }

    public static void setMaxPlayers(int newMaxPlayers) {
        maxPlayers = newMaxPlayers;
    }

    public void addPlayer() {

        if (currentPlayers < maxPlayers) {
            currentPlayers++;
        }
    }

    public void printGameStatus() {
        System.out.println("Название игры: " + this.gameName + " Текущее кол-во игроков: " + this.currentPlayers + " максимальное кол-во игроков: " + maxPlayers);
    }
}
