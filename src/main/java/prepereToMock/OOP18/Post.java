package prepereToMock.OOP18;

import java.util.HashSet;
import java.util.Set;

public class Post {
    private final int id;
    private final String text;
    private final Set<User> likedBy = new HashSet<>();

    public Post(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public void like(User user) {
        likedBy.add(user);
    }

    public void unlike(User user) {
        likedBy.remove(user);
    }

    public int getLikesCount() {
        return likedBy.size();
    }

    public boolean hasLiked(User user) {
        return likedBy.contains(user);
    }
}
