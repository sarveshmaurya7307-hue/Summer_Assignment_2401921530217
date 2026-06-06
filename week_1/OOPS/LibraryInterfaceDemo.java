package week_1.OOPS;

public class LibraryInterfaceDemo {

    public static void main(String[] args) {

        System.out.println("===== Kid User Test =====");

        KidUser kid = new KidUser(10, "Kids");
        kid.registerAccount();
        kid.requestBook();

        System.out.println();

        System.out.println("===== Adult User Test =====");

        AdultUser adult = new AdultUser(23, "Fiction");
        adult.registerAccount();
        adult.requestBook();
    }
}
