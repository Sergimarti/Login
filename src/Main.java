import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class Main {
    private static final String EMAIL = "sm@lop.com";
    private static final String PASSWORD = "login";


    public static void main(String[] args) {

        String useremail = askForUserEmail();
        String userpassword = askForUserPassword();
        boolean resultat = UserLogin(useremail, userpassword, EMAIL, PASSWORD);


    }

    private static boolean UserLogin(String useremail, String userpassword, String EMAIL, String PASSWORD) {
        boolean result = useremail.equals(EMAIL) && userpassword.equals(PASSWORD);

        if (result) {
            System.out.println(" has logat correctament");
        } else {
            System.out.println("Dades incorrectes");
        }
        return true;
    }

    private static String askForUserPassword() {
        System.out.println("entra el teu password: ");
        Scanner sc = new Scanner(System.in);
        String password = sc.next();
        return password;
    }

    private static String askForUserEmail() {
        System.out.println("entra el teu email: ");
        Scanner sc = new Scanner(System.in);
        String email = sc.next();
        return email;
    }
}
