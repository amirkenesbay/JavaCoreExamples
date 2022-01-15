package vertex_examples.userLambda;

public class Main {
    public static void main(String[] args) {
//        UserFactory userFactory = (name, username) -> new User(name, username);
        UserFactory userFactory = User::new;
        User user = userFactory.create("John" , "Snow");
    }
}
