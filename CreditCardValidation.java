public class CreditCardValidation {


    public static boolean cardNumberLength(String number) {

        int extraChars = number.length() - 16;
        if (extraChars != 0) {
            throw new IllegalArgumentException("Number length should be 16 characters!");
        }
        return true;
    }

    public static void printMessage(boolean valid) {
        if (valid){
            System.out.print("Valid!\r");
        }
        else{
            System.out.print("Invalid!");
        }
    }
}
