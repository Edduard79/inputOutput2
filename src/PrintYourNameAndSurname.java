import java.util.Scanner;

public class PrintYourNameAndSurname {
    public static void main(String[] args){
        System.out.println("Please insert your full name: ");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String surname = scanner.next();

        System.out.printf("Hello %s %s!!!", name, surname);


    }
}
