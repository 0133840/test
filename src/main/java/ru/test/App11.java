package ru.test;

public class App11 {
    public static void main(String[] args) {
        User user = new User("Malkolm");

        System.out.println(user.getName());

        Admin admin = new Admin("test", "admin@gmail.com", "9104795584");

        System.out.println(admin.getName());

        User admin2 = new Admin(null, null, null);
        System.out.println(admin2.getName());

        try {
            User user2 = new User(null);
            System.out.println(((Admin) user2).getName());
        } catch (ClassCastException ex) {
            System.out.println(ex);
        }

        simpleFunction(admin2);
    }

    public static void simpleFunction(Comparable<User> imCompare) {
        System.out.println(imCompare.compareTo(new User(null)));
    }

    abstract static class AbstractUser {
        public abstract String getName();

        public void abstractUserFunction() {
            System.out.println("Yes, i can");
        }
    }

    interface AbstractUserInterface {
        String getName();
    }

    static class User extends AbstractUser implements AbstractUserInterface, Comparable<User> {
        private String name;

        User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public int compareTo(User o) {
            return 0;
        }
    }

    static class Admin extends User {
        private String email;
        private String phone;

        Admin(String name, String email, String phone) {
            super(name);
            this.email = email;
            this.phone = phone;
        }

        @Override
        public String getName() {
            return super.getName() + "; phone: " + phone + ", email: " + email;
        }
    }
}
