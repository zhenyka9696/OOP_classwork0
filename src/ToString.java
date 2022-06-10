public class ToString {
    public static void main(String[] args) {
        User user=new User("John", "Doe");

//System.out.println(user);
        System.out.println(user.toString2());

    }
}

class User{
    String name;
    String surname;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public User(String name, String surname) {

        this.name
                = name;
        this.surname = surname;
    }

    public String toString2() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}