package prepereToMock.OOP13;

public class Main {
    static void main() {
        Playlist playlist = new Playlist("Ino");

        playlist.addTrackToPlaylist(new Song("Believer", "Imagine Dragons", 204));
        playlist.addTrackToPlaylist(new Song("Numb", "Linkin Park", 185));
        playlist.addTrackToPlaylist(new Song("Halo", "Beyonce", 261));

        playlist.showTrack();
        System.out.println("Общая длительность:");
        System.out.println(playlist.calculateDuration() + " секунд");

        playlist.removeTrackFromPlaylist("Numb");
        System.out.println("После удаления Numb:");
        playlist.showTrack();
        System.out.println(playlist.calculateDuration() + " секунд");
    }
}
