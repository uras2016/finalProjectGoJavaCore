import java.util.Scanner;

public class Input {

    public String number;
    private static Scanner input;


    public String type() {
        input = new Scanner(System.in);
        System.out.println("Please enter your card number: \n");
        String number = input.nextLine();
        CreditCardValidation creditCardValidation = new CreditCardValidation();
        boolean b = creditCardValidation.cardNumberLength(number);
//        creditCardValidation.printMessage(b);

        return number;
    }



}
