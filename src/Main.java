
public class Main {
    public static void main(String[] args) {

        String firstName = "Jhennifer";
        String lastName = "Azevedo";

        String nameComplete = nameComplete(firstName, lastName);
        System.out.printf(nameComplete);



        // Date data = new Date(01-02-2023);
    }

    public static String nameComplete (String firstname, String lastname) {
        return firstname.concat(" ").concat(lastname);
    }
}
