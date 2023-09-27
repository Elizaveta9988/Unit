public class UserRepository {
    List<User> data = new ArrayList<>();

    public void addUser(User user) {
        data.add(user);
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }






    public boolean logoutUsers(List<User> users) {
        return users.removeIf(user -> !user.isAdmin);
    }
}

