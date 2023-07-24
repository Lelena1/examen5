import java.util.*;

public class Main {
    public static void main(String[] args) {

        Collection<User> users = new ArrayList<>();
        users.add(new User("Kate", 5));
        users.add(new User("John", 15));
        users.add(new User("Slava", 52));
        users.add(new User("Kate", 5));
        users.add(new User("Sam", 5));
        users.add(new User("Tim", 25));

        User oldestUser = getOldestUser(users);
        System.out.println(oldestUser);
    }


    public static User getOldestUser(Collection<User> users) {
        Set<User> uniqueUsers = new HashSet<>(users);
        List<User> sortedUsers = new ArrayList<>(uniqueUsers);
        sortedUsers.sort(Comparator.comparing(User::getAge).reversed().thenComparing(User::getName));
        return sortedUsers.get(0);
    }
}