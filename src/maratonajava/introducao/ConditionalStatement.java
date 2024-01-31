package maratonajava.introducao;

    public class ConditionalStatement {
        public static void main(String[] args) {
            String answer = "yes";
            String messageADonor = "I'll help you!";
            String messageNotDonor = "I won't help you...";

            // (condition) ? if is true (...) : else (...);
            String result = answer == "yes" ? messageADonor : messageNotDonor;
            System.out.println(result);
        }
    }
