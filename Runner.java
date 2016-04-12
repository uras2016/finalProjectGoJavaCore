public class Runner {




    public static void main(String[] args) throws Exception{
        Input input = new Input();
        CreditCardValidation creditCardValidation = new CreditCardValidation();
        Luhn luhn = new Luhn();

        CreditCard creditCard = new CreditCard();

        System.out.println("Hi! You are lucky to use our program!");

        String a = input.type();

        boolean result = Luhn.luhn(a);
        creditCardValidation.printMessage(result);



        }


    }

