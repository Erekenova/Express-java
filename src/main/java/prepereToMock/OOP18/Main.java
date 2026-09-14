package prepereToMock.OOP18;

public class Main {
    static void main() {
        Post post = new Post(1, "Круто!");
        User alex = new User("Alex");
        User maria = new User("Maria");

        post.like(alex);
        post.like(maria);
        post.like(alex);

        System.out.println("Количество лайков:");
        System.out.println(post.getLikesCount());
        System.out.println("Alex ставил лайк: " + post.hasLiked(alex));
        System.out.println("Maria ставила лайк: " + post.hasLiked(maria));

        post.unlike(alex);

        System.out.println("Количество лайков:");
        System.out.println(post.getLikesCount());
        System.out.println("Alex ставил лайк: " + post.hasLiked(alex));
    }
}
