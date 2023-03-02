import java.util.Scanner;

public class Encapsulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student s1 = new Student();
        s1.setName("Nikil");
        System.out.println("Enter Password");
        String pass = scanner.nextLine();
//        System.out.println(s1.password);
        System.out.println(s1.getPhone(pass));
    }
}
